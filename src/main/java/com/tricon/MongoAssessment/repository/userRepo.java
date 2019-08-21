package com.tricon.MongoAssessment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tricon.MongoAssessment.model.Employee;

@Repository
public interface userRepo extends MongoRepository<Employee, String>{
	
	//public users findByUsername(String username);

}

