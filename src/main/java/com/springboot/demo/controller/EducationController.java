package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.EducationModel;

@RestController
@RequestMapping("/s1/kk")
public class EducationController {

	@GetMapping("/ssss")
	public EducationModel getEducation() {
		EducationModel ed = new EducationModel();
		ed.setNameofEducation("vignan");
		ed.setClasses("lkg to 12");
		ed.setAdress("vizag");
		return ed;
	}
}