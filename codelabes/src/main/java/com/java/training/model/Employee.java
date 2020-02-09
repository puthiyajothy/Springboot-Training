package com.java.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long empId;
	String employeeName;
	String employeeLocation;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

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

	public Employee(String employeeName, String employeeLocation) {
		this.employeeName = employeeName;
		this.employeeLocation = employeeLocation;
	}

//	public static List<Employee> getAllEmployees() {
//
//		List<Employee> employee = new ArrayList<>();
//		
//		employee.add(new Employee("jothi", "Badulla"));
//		employee.add(new Employee("jothi", "Badulla"));
//		employee.add(new Employee("jothi", "Badulla"));
//		
//		return employee;
//
//	}

//	@Override
//	public String toString() {
//		return "Employee [employeeName=" + employeeName + ", employeeLocation=" + employeeLocation + "]";
//	}

	
}
