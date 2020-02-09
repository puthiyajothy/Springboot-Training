package com.java.training.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.training.model.Employee;
import com.java.training.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getallemployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveemployee(Employee employee) {
		employeeRepository.save(employee);

	}

}
