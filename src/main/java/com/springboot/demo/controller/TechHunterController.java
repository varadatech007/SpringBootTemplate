package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.TechHunterModel;
import com.springboot.demo.service.TechHunterService;

@RestController
@RequestMapping("/v1/app")

public class TechHunterController {
	
	@Autowired
	private TechHunterService hunterService;
	
	@GetMapping("/techdata")
	public TechHunterModel getHunterModel() {
		TechHunterModel tec = hunterService.getHunterModel();
		return tec;
		
	}

}
