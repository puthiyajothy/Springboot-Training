package com.java.training.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String employeeName;
	String employeeLocation;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Telephone> telephones;

	
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_project", joinColumns = {
            @JoinColumn(name = "eid", referencedColumnName = "id")}, inverseJoinColumns = {
            @JoinColumn(name = "pid", referencedColumnName = "id")})
	public List<Project> projects;
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
    Address addresses;
	
    public Address getAddresses() {
		return addresses;
	}

	public void setAddresses(Address addresses) {
		this.addresses = addresses;
	}


	public List<Telephone> getTelephones() {
		return telephones;
	}

	public void setTelephones(List<Telephone> telephones) {
		this.telephones = telephones;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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


	public Employee(Integer empId, String employeeName, String employeeLocation, List<Telephone> telephones,Address address,List<Project>project) {
		super();
		this.id = empId;
		this.employeeName = employeeName;
		this.employeeLocation = employeeLocation;
		this.telephones = telephones;
		this.addresses=address;
		this.projects = project;
		
	}

	public Employee() {

	}

	public static List<Employee> getAllEmployees() {

		List<Employee> employee = new ArrayList<>();
		List<Telephone> telephone = new ArrayList<>();
		List<Project> project = new ArrayList<>();
		telephone.add(new Telephone(1,"25686465"));
		project.add(new Project(1,"name",employee));
		employee.add(new Employee(1,"jothi", "Badulla",telephone,new Address(2,"sdh","dyudtg"),project));
		
		return employee;

	}

//	@Override
//	public String toString() {
//		return "Employee [employeeName=" + employeeName + ", employeeLocation=" + employeeLocation + "]";
//	}

}
