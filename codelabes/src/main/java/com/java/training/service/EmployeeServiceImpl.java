package com.java.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.training.model.Employee;
import com.java.training.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

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

}
