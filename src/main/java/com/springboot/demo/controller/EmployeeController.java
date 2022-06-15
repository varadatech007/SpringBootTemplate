package com.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.MobileModels;
import com.springboot.demo.service.MobileModelService;

@RestController
@RequestMapping("/hyd")
public class EmployeeController {
	
	@Autowired
	public MobileModelService mobileModelService;
	
	@GetMapping("/v1/jntu")
	
	public MobileModels getmobileModels() {
		MobileModels ms	=mobileModelService.getmobileModels();
		return ms;
			
	}
	
	@GetMapping("/v2/jntuk")
	
	public List<MobileModels> getMobileModels(){
	List<MobileModels>	mobilemodels=mobileModelService.getMobileModels();
	return mobilemodels;
	}
	}


