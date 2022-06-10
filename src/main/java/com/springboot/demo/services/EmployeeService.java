package com.springboot.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

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
em1.setFirstName("masoom");
em1.setLastName("basha");
em1.setDepartment("cse");
em1.setSalary(8000);
return em1;

}
}
