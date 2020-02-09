package com.java.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.training.model.Employee;
import com.java.training.service.EmployeeService;


@RestController
//@RequestMapping("/services")
public class EmployeeController {

	@SuppressWarnings("unused")
	@Autowired
	private EmployeeService employeeservice;
	
	@RequestMapping("/hello")
	public String GetallEmployee() {
		return "<h1>hello Baby</h1>";

	}

//	@RequestMapping("/employee")
//	public List<Employee> getEmployees() {
//		return employeeservice.getallemployee();
//
//	}
	
	@RequestMapping("/saveemployee")
	public void saveemployee(@RequestBody Employee employee ) {
		employeeservice.saveemployee(employee);
	}
	

	@RequestMapping("/getemployee")
	public List<Employee>getAllemployee(){
		return employeeservice.getallemployee();
	}

}



