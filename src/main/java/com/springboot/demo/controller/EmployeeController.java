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
		em.setFirstName("vindula");
		em.setLastName("jagadish");
		em.setDepartment("IT");
		em.setSalary(3000);
		return em;
	}
	
	@GetMapping("/emp2")
	public EmployeeModel getEmployeeModel() {
		EmployeeModel em2 = new EmployeeModel();
		em2.setFirstName("Jagadeesh");
		em2.setLastName("VVVV");
		em2.setEmpId(22121);
		em2.setDepartment("Mech");
		em2.setSalary(1000000);
		
		return em2;
		
	}

}
