package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.StudentDetails;

@RestController
@RequestMapping("/std1/api")
public class StudentController {
	
		@GetMapping("/studata")
		public StudentDetails getstudent() {
			StudentDetails stu = new StudentDetails();
			stu.setStudId(108110347);
			stu.setFirstName("kiran");
			stu.setLastName("talari");
			stu.setRollno(0347);
			return stu;
			
		
	}

}
