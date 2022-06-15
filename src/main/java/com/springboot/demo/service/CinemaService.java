package com.springboot.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.demo.model.Cinema;

@Service
public class CinemaService {

	public List<Cinema> getcinemas() {
		List<Cinema> cin = new ArrayList<>();

		Cinema ci = new Cinema();
		ci.setDirectorName("puri");
		ci.setMusicDirectorName("dsp");
		ci.setProducerName("bandlaganesh");
		ci.setMovieBudget(1000);
		cin.add(ci);

		Cinema ci1 = new Cinema();
		ci1.setDirectorName("puri");
		ci1.setMusicDirectorName("dsp");
		ci1.setProducerName("bandlaganesh");
		ci1.setMovieBudget(1000);
		cin.add(ci1);
		return cin;
	}

}
