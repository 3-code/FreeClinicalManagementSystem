package com.code.fcms.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.code.fcms.model.Employee;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

	@RequestMapping(value="/all", method = RequestMethod.GET)
	public List<Employee> getAll(){
		System.out.println(">>>> getAll");
		return null;
	}
}
