package com.springboot.demo.service;

import org.springframework.stereotype.Service;

import com.springboot.demo.model.MobileModels;

@Service
public class MobileModelService {
	
	public MobileModels getMobileModels() {
		MobileModels mm = new MobileModels();
		mm.setMobName("mi");
		mm.setMobPrize(342424);
		mm.setMobSeries("minote10s");
		return mm;
		
	}
	
}
