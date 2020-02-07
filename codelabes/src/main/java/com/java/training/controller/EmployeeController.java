package com.java.training.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.java.training.model.Employee;


@RestController
@RequestMapping("/services")
public class EmployeeController {

	@RequestMapping("/hello")
	public String GetallEmployee() {
		return "<h1>hello springboot</h1>";

	}

	@RequestMapping("/employee")
	public List<Employee> getEmployees() {
		return Employee.getAllEmployees();

	}

}



