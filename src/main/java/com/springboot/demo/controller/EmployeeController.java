package com.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.Cinema;
import com.springboot.demo.model.EmployeeModel;
import com.springboot.demo.service.CinemaService;

@RestController
@RequestMapping("/v1/api")
public class EmployeeController {

	@Autowired
	public CinemaService getcinemaService;

	@GetMapping("/empdata")
	public EmployeeModel getEmployee() {
		EmployeeModel em = new EmployeeModel();
		em.setFirstName("Varada");
		em.setLastName("Ramana");
		em.setDepartment("IT");
		em.setSalary(5000);
		return em;
	}

	@GetMapping("/cinimaa")
	public List<Cinema> getCinemas() {
		List<Cinema> vi = getcinemaService.getcinemas();
		return vi;

	}
}
