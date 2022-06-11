package com.springboot.demo.service;

import org.springframework.stereotype.Service;

import com.springboot.demo.model.CricketModel;

@Service
public class CricketService {
	
	
	public CricketModel getCricketModel() {
		CricketModel cm = new CricketModel();
		cm.setCricketName("Dhoni");
		cm.setMostRuns(100);
		cm.setCricketerid(007);
		cm.setCricketKitlist("Bat");
		
		return cm;
		
	}
}
