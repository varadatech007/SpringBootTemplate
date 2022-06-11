package com.springboot.demo.controller;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.CricketModel;
import com.springboot.demo.service.CricketService;

@RestController
@RequestMapping("aa/kk")
public class CricketController {
	
	@Autowired
	CricketService getCricketService;

	@GetMapping("/CricketModel")
	public CricketModel getCricketModel() {
		CricketModel cm = getCricketService.getCricketModel();
		
		return cm;
		
	}

}
			
			
	

