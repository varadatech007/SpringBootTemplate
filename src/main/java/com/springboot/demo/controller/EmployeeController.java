package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.EmployeeModel;
import com.springboot.demo.model.StudentDetails;

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
	
	@GetMapping("/StudentDetails")
	public StudentDetails getStudent() {
		StudentDetails sd = new StudentDetails();
		sd.setStudentfirstName("Ananth");
		sd.setStudentlastName("Adithya");
		sd.setStudentIdName(2108);
		sd.setStudentdepartment("Mech");
		
		return sd;
	
		
	}
	

}
