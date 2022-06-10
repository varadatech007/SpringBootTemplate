package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.CarModel;
import com.springboot.demo.service.CarService;

@RestController
@RequestMapping("/car/api")
public class CarController {
	
	@Autowired
	CarService getcarService;
	
	@GetMapping("/crd")
	public CarModel getCarModel() {
		CarModel cm = getcarService.getCarModel();
		return cm;
		
	
	}
	
	@GetMapping("/crk")
	public CarModel getCarModel2() {
		CarModel cm1 = getcarService.getCarModel2();
		return cm1;
	}
	
	@GetMapping("/crm")
	public String getCarModel3() {
		CarModel cm2 = getcarService.getCarModel();
		String cnm = cm2.getCarName();
		return cnm;
		
	
	}
}
