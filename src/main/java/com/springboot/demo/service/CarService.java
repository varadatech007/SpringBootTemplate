package com.springboot.demo.service;

import org.springframework.stereotype.Service;

import com.springboot.demo.model.CarModel;

@Service
public class CarService {
	public CarModel getCarModel() {
		CarModel cr = new CarModel();
		cr.setCarName("Benz");
		cr.setCarModel("Mercidows");
		cr.setCarType("Petrol");
		cr.setCarSeries("High Class");
		cr.setCarLocation("Hyderabad");
		return cr;
		
	}

}
