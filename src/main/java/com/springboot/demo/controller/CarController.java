package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.service.CarService;

@RestController
@RequestMapping("/car/api")
public class CarController {
	
	@Autowired
	@GetMapping("/crd")
	public CarService getCarService() {
		CarService cs = new CarService();
		
		return cs;
		
	}

}
