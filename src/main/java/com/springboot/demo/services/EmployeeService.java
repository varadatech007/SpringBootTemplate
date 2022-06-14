package com.springboot.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.demo.model.EmployeeModel;
import com.springboot.demo.model.StudentModel;

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
		em1.setFirstName("masoom");
		return em1;

	}

	public List<EmployeeModel> getEmployeeModels() {
		List<EmployeeModel> list = new ArrayList<EmployeeModel>();
		EmployeeModel em2 = new EmployeeModel();
		em2.setFirstName("basha");
		em2.setLastName("masoom");
		em2.setDepartment("it");
		em2.setSalary(18000);
		list.add(em2);

		EmployeeModel em3 = new EmployeeModel();
		em3.setFirstName("sankar");
		em3.setLastName("kumar");
		em3.setDepartment("it");
		em3.setSalary(15000);
		list.add(em3);

		EmployeeModel em4 = new EmployeeModel();
		em4.setFirstName("kiran");
		em4.setLastName("kumar");
		em4.setDepartment("SE");
		em4.setSalary(16000);
		list.add(em4);

		EmployeeModel em5 = new EmployeeModel();
		em5.setFirstName("sateesh");
		em5.setLastName("kumar");
		em5.setDepartment("LE");
		em5.setSalary(28000);
		list.add(em5);
		return list;

	}

}
