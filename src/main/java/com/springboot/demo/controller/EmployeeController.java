package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.EmployeeModel;
import com.springboot.demo.model.EmployeeModel2;

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

	@GetMapping("/emp2")
	public EmployeeModel2 getEmployee2() {
		EmployeeModel2 emp = new EmployeeModel2();
		emp.setEmpName("Kiran");
		emp.setEmpId(20302583);
		emp.setEmpAccess("All");
		emp.setEmpEmail("Kiranr@gmail.com");
		return  emp;
	}
}
