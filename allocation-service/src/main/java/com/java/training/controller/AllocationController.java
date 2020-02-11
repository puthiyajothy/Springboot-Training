package com.java.training.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.java.training.model.Allocation;

@Controller
//@RequestMapping("/services")
public class AllocationController {
	
//	@Autowired
//	AllocationRepository allocationrepository;
	
	
	@RequestMapping(value = "/saveallocation", method = RequestMethod.POST)
	public Allocation saveemployee(@RequestBody Allocation allocation ) {
		return null;
	}
	

	@RequestMapping(value="/getallocation",method=RequestMethod.GET)
	public List<Allocation>getallocation(){
		return Allocation.getAllallocation();
	}


}
