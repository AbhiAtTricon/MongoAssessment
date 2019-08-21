package com.tricon.MongoAssessment.services;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.MongoAssessment.model.Employee;
import com.tricon.MongoAssessment.repository.userRepo;


@Service
public class UserService {

	@Autowired
	private userRepo userrepo;
	
	public String createUser(String name, String departments, String reporting_Manager,int age,float salary)
	{
		Employee emp = new Employee(name,departments,reporting_Manager,age,salary);
		userrepo.save(emp);
		return ("New user created with id: " + emp.getId());
	}
	
	public List<Employee> listusers()
	{
		return userrepo.findAll();
		
	}
	
	/*
	 * public users findUser(String username) { users user =
	 * userrepo.findByUsername(username);
	 * 
	 * return user; }
	 */
	public void updateUser(Employee user)
	{
		userrepo.save(user);		
	}
	public String deleteUser(Employee user)
	{
		userrepo.delete(user);
		return "Employee deleted";
	}
}
