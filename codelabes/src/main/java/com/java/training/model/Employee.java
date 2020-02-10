package com.java.training.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer empId;
	String employeeName;
	String employeeLocation;

	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL,fetch = FetchType.EAGER )
	List<Telephone>telephone;
	
	public List<Telephone> getTelephone() {
		return telephone;
	}

	public void setTelephone(List<Telephone> telephone) {
		this.telephone = telephone;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
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

	public Employee() {

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
