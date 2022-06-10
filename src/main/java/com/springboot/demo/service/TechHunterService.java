package com.springboot.demo.service;

import org.springframework.stereotype.Service;

import com.springboot.demo.model.TechHunterModel;


@Service
public class TechHunterService {

	public TechHunterModel getHunterModel() {
		TechHunterModel th = new TechHunterModel();
		th.setName("Basha");
		th.setLocation("kurnool");
		th.setPhoneNumber(889789749);
		th.setPinCode(518466);
		return th;

	}

}
