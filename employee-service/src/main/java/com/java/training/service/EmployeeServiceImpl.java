package com.java.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.training.model.Employee;
import com.java.training.model.Telephone;
import com.java.training.repository.EmployeeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Bean
	RestTemplate getRestTemplate() {
		
		
		return new RestTemplate();
	}
	
	@Autowired
	RestTemplate resttemplate;

	@Override
	public List<Employee> getallemployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveemployee(Employee employee) {
		
		for (Telephone t : employee.getTelephones()) {
			
			t.setEmployee(employee);
			
		}
		return employeeRepository.save(employee);

	}
	
	@Override
	public Employee getemployeebyid(int id) {
		
		Optional<Employee> optionalEmployee = employeeRepository.findById(id);
		
        if (optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            HttpHeaders httpheader = new HttpHeaders();
            
            HttpEntity<String> httpentity = new HttpEntity<String>("",httpheader);
            ResponseEntity<Allocation[]> responseentity = resttemplate.exchange("http://localhost:8181/services/allocation/"+employee.getId(), HttpMethod.GET, httpentity, Allocation[].class);
            employee.setAllocation(responseentity.getBody());
           
            return employee;
       } 
        
       else {
       
        	return null;
        	
        }
	}


}
