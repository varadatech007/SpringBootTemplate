package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.EmployeeModel;

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
	@GetMapping("/empdata2")
	public EmployeeModel getEmployee1() {
	EmployeeModel em1 = new EmployeeModel();
	em1.setFirstName("masoom");
	em1.setLastName("basha");
	em1.setDepartment("cse");
	em1.setSalary(8000);
	return em1;

	}
}
