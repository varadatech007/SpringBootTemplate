package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.EmployeeModel;
import com.springboot.demo.model.MobileModels;

@RestController
@RequestMapping("/v1/api")
public class EmployeeController {
	
	
	@GetMapping("/empdata")
	public EmployeeModel getEmployee() {
		EmployeeModel em = new EmployeeModel();
		em.setFirstName("Varada");
		em.setLastName("Ramana");
		em.setDepartment("IT");
		em.setSalary(5000);
		return em;
	}
	
	@GetMapping("/mobdata")
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
