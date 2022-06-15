package com.springboot.demo.service;

import java.util.ArrayList;
import java.util.List;

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

	public List<EmployeeModel> getEmployeeModels() {
		List<EmployeeModel> list = new ArrayList<EmployeeModel>();
		EmployeeModel em2 = new EmployeeModel();
		em2.setFirstName("Sateesh");
		em2.setLastName("Patakamsetty");
		em2.setDepartment("IT");
		em2.setSalary(2000);
		list.add(em2);

		EmployeeModel em3 = new EmployeeModel();
		em3.setFirstName("masoom");
		em3.setLastName("basha");
		em3.setDepartment("software engineer");
		em3.setSalary(200000);
		list.add(em3);

		EmployeeModel em4 = new EmployeeModel();
		em4.setFirstName("uday");
		em4.setLastName("kumar");
		em4.setDepartment("analysit");
		em4.setSalary(20300);
		list.add(em4);

		EmployeeModel em5 = new EmployeeModel();
		em5.setFirstName("kiran");
		em5.setLastName("kumar");
		em5.setDepartment("developer");
		em5.setSalary(200000);
		list.add(em5);

		return list;

	}

}
