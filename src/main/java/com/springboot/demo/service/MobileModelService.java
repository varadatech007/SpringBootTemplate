package com.springboot.demo.service;

import org.springframework.stereotype.Service;

import com.springboot.demo.model.MobileModels;

@Service
public class MobileModelService {
	
public MobileModels getMobileModels() {
		MobileModels mb = new MobileModels();
		mb.setMobName("Redmi");
		mb.setMobSeries("Redmi10s");
		mb.setMobPrize(25000);
		mb.setMobImei(98883899);
		mb.setMobOsType("Android");
		
		return mb;

}
}