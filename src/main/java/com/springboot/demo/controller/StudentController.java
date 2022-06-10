package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.StudentDetails;
import com.springboot.demo.service.StudentService;

@RestController
@RequestMapping("/std1/api")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/studata")
	public StudentDetails getStudentDetails() {
		StudentDetails stu1 = studentService.getStudentDetails();
		return stu1;

	}

}
