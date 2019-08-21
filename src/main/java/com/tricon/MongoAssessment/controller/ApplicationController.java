package com.tricon.MongoAssessment.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.MongoAssessment.model.Employee;
import com.tricon.MongoAssessment.services.UserService;

@RestController
@RequestMapping("/users")
public class ApplicationController {
	
	@Autowired
	private UserService userservice;

	@GetMapping("/add")
	public String createUser(@RequestParam("name") String name, @RequestParam("departments") String departments,
			@RequestParam("reportingManager") String reportingManager, @RequestParam("age") int age,@RequestParam("salary") float salary) {

		return userservice.createUser(name,departments,reportingManager,age,salary);
	}

	@GetMapping("/listusers")
	public List<Employee> listUser() {
		return userservice.listusers();
	}
	
	@GetMapping("/updateUser")
	public String updateUser(@RequestParam("name") String name, @RequestParam("departments") String departments) {
		if(!name.equals("") && !departments.equals(""))
		{
		for (Employee user : userservice.listusers()) {

			if (user.getName().equals(name)) {
				user.setDepartments(departments);
				userservice.updateUser(user);
			}
			
			// System.out.println(user.getUsername());
		}
		
		}
		else
			return "Please enter the correct name and departments";
		
		return "User updated";

	}
	
	@GetMapping("/delete")
	public String deleteUser(@RequestParam("name") String name)
	{
		if(!name.equals(""))
		{
			for (Employee user : userservice.listusers()) {
	
				if (user.getName().equals(name)) {
					userservice.deleteUser(user);				
				}
				
				// System.out.println(user.getUsername());
			}

		}
		else
			return "Please enter the correct name";
		return "User deleted";
	}
}
