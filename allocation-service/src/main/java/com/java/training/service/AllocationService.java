package com.java.training.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.training.model.Allocation;

@Service
public interface AllocationService {

	Allocation saveallocation(Allocation allocation);
	List<Allocation>getallallocation();
	List<Allocation> getAllocationbyid(Integer id);
	
}
