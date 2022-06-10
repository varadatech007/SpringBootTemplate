package com.springboot.demo.service;

import org.springframework.stereotype.Service;

import com.springboot.demo.model.BikeModel;

@Service
public class BikeService {
	
	public BikeModel getBikeModel() {
		BikeModel bm = new BikeModel();
		bm.setBikecompany("tvs");
		bm.setBikemodel("apache");
		bm.setBikecc("159");
		bm.setBikeweight("200");
		bm.setBikeyear("2019");
		return bm;
		
		
		
		
	}

}
