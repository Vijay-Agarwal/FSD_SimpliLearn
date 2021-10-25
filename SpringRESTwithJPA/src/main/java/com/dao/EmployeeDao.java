package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
@Autowired
EntityManager emf; //like Session factory
public List<Employee> getAllEmployee(){
	EntityManager manager;
	return manager;
}
}
