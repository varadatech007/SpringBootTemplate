package com.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.springboot.demo.model.CarModel;
import com.springboot.demo.service.CarService;

@RestController
@RequestMapping("/car/api")
public class CarController {

	@Autowired
	CarService getcarService;

	@GetMapping("/crj")
	public CarModel getCarModel() {
		CarModel cm = getcarService.getCarModel();
		return cm;
	}

	@GetMapping("/crk")
	public CarModel getCarModel2() {
		CarModel cm1 = getcarService.getCarModel2();
		return cm1;
	}

	@GetMapping("/crl")
	public String getCarModel3() {
		CarModel cm2 = getcarService.getCarModel();
		String cnm = cm2.getCarName();
		return cnm;

	}

	@GetMapping("/crm")
	public List<CarModel> getCarModel4() {
		List<CarModel> list = getcarService.getCarModels();
		return list;
	}

	@GetMapping("/crn")
	public List<CarModel> getCarModel5() {
		List<CarModel> list2 = getcarService.getCarModels2();
		return list2;
	}

	@GetMapping("/cro")
	public List<CarModel> getCarModels6() {
		List<CarModel> list3 = getcarService.getCarModels3();
		return list3;
	}

}
