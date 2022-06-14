package com.springboot.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.demo.model.EmployeeModel;

@Service
public class EmployeeService {
	
	public EmployeeModel getEmployeeModel() {
		EmployeeModel em = new EmployeeModel();
		em.setFirstName("Varada");
		em.setLastName("Ramana");
		em.setDepartment("IT");
		em.setSalary(5000);
		return em;
	}
	
	public List<EmployeeModel> getEmployeeModels(){
		List<EmployeeModel> list = new ArrayList<>();
		
		EmployeeModel em = new EmployeeModel();
		em.setFirstName("Varada");
		em.setLastName("Ramana");
		em.setDepartment("IT");
		em.setSalary(5000);
		list.add(em);
		
		EmployeeModel em1 = new EmployeeModel();
		em1.setFirstName("ramana");
		em1.setLastName("cdk");
		em1.setDepartment("Admin");
		em1.setSalary(10000);
		list.add(em1);
		
		EmployeeModel em2 = new EmployeeModel();
		em2.setFirstName("Varada");
		em2.setLastName("cdk");
		em2.setDepartment("HR");
		em2.setSalary(15000);
		list.add(em2);
		return list;
	}
	
	

}
