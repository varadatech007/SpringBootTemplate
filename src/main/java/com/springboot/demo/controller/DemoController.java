package com.springboot.demo.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.EmployeeModel;
import com.springboot.demo.model.StudentModel;
import com.springboot.demo.services.EmployeeService;
import com.springboot.demo.services.StudentService;

@RestController
@RequestMapping("/v1/api")
public class DemoController {
	private static final Integer ArrayList = null;
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private StudentService studentService;

	@GetMapping("/studata")
	public StudentModel getModel() {
		StudentModel stu = studentService.getModel();
		return stu;
	}

	@GetMapping("/studata1")
	public String getStudentModel() {
		StudentModel stu1 = studentService.getStudentModel();
		String stu = stu1.getStuFirstName();
		return stu;
	}

	@GetMapping("/empdata")
	public Integer getEmployeeModel() {
		EmployeeModel emp = employeeService.getEmployee();
		Integer empName = emp.getSalary();
		return empName;
	}

	@GetMapping("/empdata1")
	public EmployeeModel getEmployeeModel1() {
		EmployeeModel emp = employeeService.getEmployee1();
		emp.getFirstName();
		return emp;

	}

	@GetMapping("/listempdata")
	public List<EmployeeModel> getEmployeeModels() {
		List<EmployeeModel> list = employeeService.getEmployeeModels();
		List<EmployeeModel> lst = new ArrayList<EmployeeModel>();
		EmployeeModel emp = new EmployeeModel();
		for (EmployeeModel lst1 : list) {
			emp.setFirstName(lst1.getFirstName());
			lst.add(emp);
			emp = new EmployeeModel();
		}

		return lst;
	}

	@GetMapping("/linkedlistdata")
	public List<EmployeeModel> getEmployeeModels1() {
		List<EmployeeModel> list = employeeService.getEmployeeModels1();
		List<EmployeeModel> lst = new LinkedList<EmployeeModel>();
		EmployeeModel emp = new EmployeeModel();
		for(EmployeeModel lis: list) {
			emp.setLastName(lis.getLastName());
			lst.add(emp);
			emp = new EmployeeModel();
		}
		return lst;

	}

}