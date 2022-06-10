package com.springboot.demo.services;

import org.springframework.stereotype.Service;

import com.springboot.demo.model.StudentModel;

@Service
public class StudentService {
	
	public StudentModel getModel() {
		StudentModel stu =new  StudentModel();
		stu.setStuRollNumber(1014568);
		stu.setStuFirstName("masoom");
		stu.setStuLastName("basha");
		stu.setBranch("cse");
		return stu;
		
	}
public StudentModel getStudentModel() {
	StudentModel stu1 =new  StudentModel();
	stu1.setStuRollNumber(1014569);
	stu1.setStuFirstName("kiran");
	stu1.setStuLastName("kumar");
	stu1.setBranch("civil");
	return stu1;
	
}
}
