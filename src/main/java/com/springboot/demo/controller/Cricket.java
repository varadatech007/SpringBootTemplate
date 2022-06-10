package com.springboot.demo.controller;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.CricketModel;

@RestController
@RequestMapping("aa/kk")
public class Cricket {

	@GetMapping("/CricketModel")
	public CricketModel getCricket() {
	CricketModel cm = new CricketModel();
	cm.setCricketName("Dhoni");
	cm.setCricketKitlist("Mrf");
	cm.setMostRuns(10324);
	cm.setCricketerid(0707);
		
	return cm;
	}
}
			
			
	

