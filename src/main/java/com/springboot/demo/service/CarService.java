package com.springboot.demo.service;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.demo.model.CarModel;

@Service
public class CarService {
	public CarModel getCarModel() {
		CarModel crk = new CarModel();
		crk.setCarName("Benz");
		crk.setCarModel("Mercidows");
		crk.setCarType("Petrol");
		crk.setCarSeries("High Class");
		crk.setCarLocation("Hyderabad");
		return crk;

	}

	public CarModel getCarModel2() {
		CarModel crl = new CarModel();
		crl.setCarName("Audi");
		crl.setCarModel("a48");
		crl.setCarType("disel");
		crl.setCarSeries("Low Class");
		crl.setCarLocation("Chennai");
		return crl;

	}

	public List<CarModel> getCarModels() {
		List<CarModel> list = new ArrayList<CarModel>();
		CarModel crm = new CarModel();
		crm.setCarName("Range Rover");
		crm.setCarModel("2018");
		crm.setCarType("Petrol");
		crm.setCarSeries("Sport");
		crm.setCarLocation("Bangalore");
		list.add(crm);
		return list;
	}

	public List<CarModel> getCarModels2() {
		List<CarModel> list2 = new ArrayList<CarModel>();
		CarModel crn = new CarModel();
		crn.setCarName("Land Rover");
		crn.setCarModel("2020");
		crn.setCarType("Petrol");
		crn.setCarSeries("Speed");
		crn.setCarLocation("Mumbai");
		list2.add(crn);

		return list2;

	}

	public List<CarModel> getCarModels3() {
		List<CarModel> list3 = new ArrayList<CarModel>();
		CarModel cro = new CarModel();
		cro.setCarName("Ferrari");
		cro.setCarModel("2021");
		cro.setCarType("Petrol");
		cro.setCarSeries("Sports");
		cro.setCarLocation("Delhi");
		list3.add(cro);
		return list3;
	}
}
