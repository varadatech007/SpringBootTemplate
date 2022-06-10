package com.springboot.demo.service;

import org.springframework.stereotype.Service;

import com.springboot.demo.model.EmployeeModel;

@Service
public class EmployeeService {
	
	public EmployeeModel getEmployee() {
		EmployeeModel em = new EmployeeModel();
		em.setFirstName("Varada");
		em.setLastName("Ramana");
		em.setDepartment("IT");
		em.setSalary(5000);
		return em;
		
		}
	public EmployeeModel getEmployee1() {
		EmployeeModel em1 = new EmployeeModel();
		em1.setFirstName("Sateesh");
		em1.setLastName("Patakamsetty");
		em1.setDepartment("IT");
		em1.setSalary(2000);
		return em1;
	}

}
