package com.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bean.Employee;
@Repository
public class EmployeeDao {
@Autowired
EntityManagerFactory emf; //like Session factory
public List<Employee> getAllEmployee(){
	EntityManager manager=emf.createEntityManager();
	Query qry = manager.createQuery("select emp from Employee emp");
	List<Employee> list = qry.getResultList();
	return list;
}
}