package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.LapTopModel;

@RestController
@RequestMapping("/v1/lap")
public class LapTopController {
	@GetMapping("/top")
	public LapTopModel getlapTopModel() {
		LapTopModel lp = new LapTopModel();
		lp.setLaptopName("HP");
		lp.setLaptopModel("dv0084tx");
		lp.setLaptopHardDriveType("SSD");
		lp.setLaptopRAM(16);
		return lp;
		
	}
	
	
	
	

}
