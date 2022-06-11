package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.LapTopModel;
import com.springboot.demo.service.LapTopService;

@RestController
@RequestMapping("/v1/lap")
public class LapTopController {

	@Autowired
	LapTopService getLapTopService;

	@GetMapping("/top")
	public LapTopModel getLapTopModel() {
		LapTopModel mp = getLapTopService.getLapTopModel();
		return mp;

	}

}
