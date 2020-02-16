package com.java.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.training.model.Employee;
import com.java.training.model.Telephone;
import com.java.training.repository.EmployeeRepository;
import com.java.training.shared.Allocation;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
    RestTemplate restTemplate;
    HttpHeaders httpHeaders = new HttpHeaders();
    HttpEntity<String> httpEntity = new HttpEntity<>("", httpHeaders);

    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

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
	public Employee getEmployee(Integer id) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            return employee;
        } else
            return null;
	}

	@Override
	public Employee getemployeebyid(Integer id) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();

            ResponseEntity<Allocation[]> responseEntity = restTemplate.exchange(
                    "http://localhost:8082/services/employee" + employee.getId(),
                    HttpMethod.GET,
                    httpEntity,
                    Allocation[].class);
            if (responseEntity.getStatusCode().value() == 200) {
            	employee.setAllocation(responseEntity.getBody());
            }
            // employee.setAllocations(responseEntity.getBody());
            return employee;
        } else
            return null;
	}
	


}
