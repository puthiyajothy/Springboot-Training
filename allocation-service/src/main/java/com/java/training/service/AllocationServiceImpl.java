package com.java.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.training.model.Allocation;
import com.java.training.repository.AllocationRepository;

@Service
public class AllocationServiceImpl implements AllocationService {

	@Autowired
	AllocationRepository allocationrepository;

	@Override
	public Allocation saveallocation(Allocation allocation) {
		return allocationrepository.save(allocation);
	}

	@Override
	public List<Allocation> getallallocation() {
		return allocationrepository.findAll();
	}
}
