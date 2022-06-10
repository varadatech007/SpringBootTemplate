package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.EmployeeModel;
import com.springboot.demo.model.StudentModel;
import com.springboot.demo.services.EmployeeService;
import com.springboot.demo.services.StudentService;

@RestController
@RequestMapping("/v1/api")
public class DemoController {
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private StudentService studentService;

	@GetMapping("/studata")
	public StudentModel getModel() {
		StudentModel stu = studentService.getModel();
		return stu;

	}

	@GetMapping("/studata1")
	public StudentModel getStudentModel() {
		StudentModel stu1 = studentService.getStudentModel();
		return stu1;

	}

	@GetMapping("/empdata")
	public EmployeeModel getEmployeeModel() {
		EmployeeModel emp = employeeService.getEmployee();
		return emp;

	}

	@GetMapping("/empdata1")
	public EmployeeModel getEmployeeModel1() {
		EmployeeModel emp = employeeService.getEmployee1();
		return emp;

	}
}