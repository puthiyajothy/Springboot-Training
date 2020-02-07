package com.java.training.model;
import java.util.ArrayList;
import java.util.Lis


public class Employee {
	
	String employeeName;
	String employeeLocation;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeLocation() {
		return employeeLocation;
	}
	public void setEmployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}
	
	
	public Employee( String employeeName, String employeeLocation) {
		this.employeeName = employeeName;
		this.employeeLocation = employeeLocation;
	}

	

	public static List<Employee> getAllEmployees() {

		List<Employee> employee = new ArrayList<>();
		
		employee.add(new Employee("jothi", "Badulla"));
		employee.add(new Employee("jothi", "Badulla"));
		employee.add(new Employee("jothi", "Badulla"));
		
		return employee;

	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeLocation=" + employeeLocation + "]";
	}
	
	
	

}
