package com.springboot.demo.service;

import org.springframework.stereotype.Service;

import com.springboot.demo.model.LapTopModel;

@Service
public class LapTopService {
	public LapTopModel getLapTopModel(){
		LapTopModel mp =new LapTopModel();
		mp.setLaptopName("HP");
	    mp.setLaptopModel("dv0084dx");
	    mp.setLaptopHardDriveType("SSD");
        mp.setLaptopRAM(8);
        return mp;
	}
}
