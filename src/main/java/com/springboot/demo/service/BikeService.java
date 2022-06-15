package com.springboot.demo.service;

import java.util.ArrayList;
import java.util.List;

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

	public List<BikeModel>  getBikeModels(){
		List<BikeModel> sai = new ArrayList<>();
		
		BikeModel bm = new BikeModel();
		bm.setBikecompany("tvs");
		bm.setBikemodel("apache");
		bm.setBikecc("159");
		bm.setBikeweight("200");
		bm.setBikeyear("2019");
		sai.add(bm);
		
		
		
		BikeModel b = new BikeModel();
		b.setBikecompany("hero");
		b.setBikemodel("passion");
		b.setBikecc("125");
		b.setBikeweight("180");
		b.setBikeyear("2022");
	    sai.add(b);
		
		
		
		BikeModel a = new BikeModel();
		a.setBikecompany("honda");
		a.setBikemodel("dio");
		a.setBikecc("125");
		a.setBikeweight("180");
		a.setBikeyear("2020");
		sai.add(a);
		
		
		return sai;
	
	}
}
