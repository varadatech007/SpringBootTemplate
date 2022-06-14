package com.springboot.demo.model;

import lombok.Data;

@Data
public class Department {
	
	private Integer deptId;
	private String deptName;
	private String address;
	private String city;
	private String state;
	private String country;

}
