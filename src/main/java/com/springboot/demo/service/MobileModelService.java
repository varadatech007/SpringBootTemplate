package com.springboot.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.demo.model.MobileModels;

@Service
public class MobileModelService {
	public MobileModels getmobileModels() {
		MobileModels mem = new MobileModels();
		return mem;
		
	}
	
	
	public List<MobileModels> getMobileModels(){
		List<MobileModels> mob = new ArrayList<>();
		
		 
			MobileModels mm = new MobileModels();
			mm.setMobName("ffhffhf");
			mm.setMobOsType("hghghghgggh");
			mm.setMobPrize(65757);
			mm.setMobSeries("jkudidss");
			mm.setMobImei(675755);
			mob.add(mm);
			
		 
			MobileModels mm1 = new MobileModels();
			mm1.setMobName("ffhffhfj");
			mm1.setMobOsType("hghghghggghk");
			mm1.setMobPrize(65757);
			mm1.setMobSeries("jkudidssl");
			mm1.setMobImei(675755);
			mob.add(mm1);
			
			return mob;
		

	}
}
