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
		em.setSalary(50000);
		return em;
	
		}
	@GetMapping("/empdata1")
	public EmployeeModel getEmployee1() {
		EmployeeModel em1 = new EmployeeModel();
		em1.setFirstName("Talari");
		em1.setLastName("Sankar");
		em1.setDepartment("IT");
		em1.setSalary(40000);
		return em1;
	
		}
	
	@GetMapping("/empdata2")
	public EmployeeModel getEmployee2() {
		EmployeeModel em2 = new EmployeeModel();
		em2.setFirstName("Kiran");
		em2.setLastName("Kumar");
		em2.setDepartment("IT");
		em2.setSalary(40000);
		return em2;
	
		}
	@GetMapping("/empdata3")
	public EmployeeModel getEmployee3() {
		EmployeeModel em3 = new EmployeeModel();
		em3.setFirstName("Sateesh");
		em3.setLastName("Kumar");
		em3.setDepartment("IT");
		em3.setSalary(40000);
		return em3;
	
		}
	
	@GetMapping ("/empdata4")
	public EmployeeModel getEmployee4(){
		EmployeeModel em4 = new EmployeeModel();
		em4.setFirstName("Talari");
		em4.setLastName("Venkatesh");
		em4.setDepartment("IT");
		em4.setSalary(40000);
		return em4;
	
	}
	}


