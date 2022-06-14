package com.springboot.demo.controller;

import java.util.List;

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
	public EmployeeModel getEmployee() {
		EmployeeModel emp = employeeService.getEmployeeModel();
		return emp;
	}
	
	@GetMapping("/listempdata")
	public List<EmployeeModel> getEmployeeModels(){
		List<EmployeeModel> employeeModels = employeeService.getEmployeeModels();
		return employeeModels;
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
