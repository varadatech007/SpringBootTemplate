package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.EmployeeModel;
import com.springboot.demo.service.EmployeeService;

@RestController
@RequestMapping("/v1/api")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/empdata")
	public EmployeeModel getEmployeeModel() {
		EmployeeModel emp = employeeService.getEmployee();
		return emp;
		
	}
	@GetMapping("/empdata1")
	public EmployeeModel getEmployeeModel1() {
		EmployeeModel emp1 = employeeService.getEmployee1();
		return emp1;
		
	}
	@GetMapping("/empdata2")
	public EmployeeModel getEmployeeModel2() {
		EmployeeModel emp2 = employeeService.getEmployee2();
		return emp2;
		
	}
	@GetMapping("/empdata3")
	public EmployeeModel getEmployeeModel3() {
		EmployeeModel emp3 = employeeService.getEmployee3();
		return emp3;
		
	}
	@GetMapping("/empdata4")
	public EmployeeModel getEmployeeModel4() {
		EmployeeModel emp4 = employeeService.getEmployee4();
		return emp4;
		
	}
		}


