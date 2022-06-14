package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.Department;

@RestController
@RequestMapping("/v1/dept")
public class DepartmentController {
	
	@GetMapping("/deptdetails")
	public Department getDeprtment() {
		Department dept = new Department();
		dept.setDeptId(100);
		dept.setAddress("123-433/23");
		dept.setState("Telangana");
		dept.setCity("Hyderabad");
		dept.setCountry("India");
		dept.setDeptName("IT Sector");
		return dept;
	}

}
