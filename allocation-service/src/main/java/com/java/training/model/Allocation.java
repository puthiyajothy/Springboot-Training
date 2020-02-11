package com.java.training.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "allocation")
public class Allocation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	Integer startdate;
	Integer enddate;
	String project;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStartdate() {
		return startdate;
	}

	public void setStartdate(Integer startdate) {
		this.startdate = startdate;
	}

	public Integer getEnddate() {
		return enddate;
	}

	public void setEnddate(Integer enddate) {
		this.enddate = enddate;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Allocation(Integer id, Integer startdate, Integer enddate, String project) {
		super();
		this.id = id;
		this.startdate = startdate;
		this.enddate = enddate;
		this.project = project;
	}

	public static List<Allocation> getAllallocation() {
		List<Allocation> allocation = new ArrayList<>();
		allocation.add(new Allocation(1, 2012, 2013, "ABC"));
		return allocation;

	}

	@Override
	public String toString() {
		return "Allocation [id=" + id + ", startdate=" + startdate + ", enddate=" + enddate + ", project=" + project
				+ "]";
	}

}
