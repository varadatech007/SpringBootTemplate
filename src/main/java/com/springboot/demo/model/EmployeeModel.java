package com.springboot.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class EmployeeModel {
	
	private String firstName;
	private String lastName;
	private Integer salary;
	private String department;
	
}
