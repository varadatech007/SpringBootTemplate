package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.BikeModel;
import com.springboot.demo.service.BikeService;

@RestController
@RequestMapping("/Va/sai")
public class BikeController {
	
	@Autowired
	private BikeService bikeService;
	
	@GetMapping("/v2")
	public BikeModel getBike() {
	BikeModel bs = bikeService.getBikeModel();
	
		return bs;
		
	}
	
	

	
}
