package com.tricon.MongoAssessment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="assessment")
public class Employee {

	@Id
	private String id;
	private  String Name;
	private  String Departments;
	private String Reporting_Manager;
	private int Age;
	private float Salary;
	
	Employee()
	{
		
	}

	public Employee(String name, String departments, String reporting_Manager, int age, float salary) {
		super();
		Name = name;
		Departments = departments;
		Reporting_Manager = reporting_Manager;
		Age = age;
		Salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDepartments() {
		return Departments;
	}

	public void setDepartments(String departments) {
		Departments = departments;
	}

	public String getReporting_Manager() {
		return Reporting_Manager;
	}

	public void setReporting_Manager(String reporting_Manager) {
		Reporting_Manager = reporting_Manager;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}
	
	
	
}
