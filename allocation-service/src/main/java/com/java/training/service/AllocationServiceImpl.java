package com.java.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.training.model.Allocation;
import com.java.training.repository.AllocationRepository;
import org.springframework.data.domain.Example;

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
	
	
	@Override
	public List<Allocation> getAllocationbyid(Integer id) {
		//Optional<Allocation> optionalAllocation = allocationrepository.findById(id);
		Allocation allocation = new Allocation();
		allocation.setEmpId(id);
		
		Example<Allocation> allocationbyid = Example.of(allocation);
		//if (optionalAllocation.isPresent()) {
           // return optionalAllocation.get();
        //}
            
            
        return allocationrepository.findAll(allocationbyid);
	}
}
