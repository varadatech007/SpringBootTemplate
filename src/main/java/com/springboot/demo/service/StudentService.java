package com.springboot.demo.service;

import org.springframework.stereotype.Service;

import com.springboot.demo.model.StudentDetails;

@Service
public class StudentService {
public StudentDetails getStudentDetails() {
	StudentDetails std=new StudentDetails();
	std.setFirstName("kiran");
	std.setLastName("talari");
	std.setRollno(0347);
	std.setStudId(108110347);
	return std;
	
}

}
