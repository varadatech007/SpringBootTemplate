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
	public EmployeeModel getEmployeeModel() {
		EmployeeModel emp = employeeService.getEmployee();
		return emp;
	}

	@GetMapping("/empdata1")
	public Integer geModel() {
		EmployeeModel emp = employeeService.getEmployee();
		Integer emp1 = emp.getSalary();
		return emp1;

	}

	@GetMapping("/empdata2")
	List<EmployeeModel> getEmployeeModels() {
		List<EmployeeModel> list = employeeService.getEmployeeModels();
		return list;

	}
}
