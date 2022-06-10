package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.MobileModels;
import com.springboot.demo.service.MobileModelService;

@RestController
@RequestMapping("/n1/kishi")
public class EmployeeController {
	
	@Autowired
	private MobileModelService mobileModelService;
	
	@GetMapping("/v3/guru")
	
	public MobileModels getMobileModels() {
		MobileModels mms = mobileModelService.getMobileModels();
		mms.setMobName("mi");
		return mms;
		
	}
	
	
	
	}


