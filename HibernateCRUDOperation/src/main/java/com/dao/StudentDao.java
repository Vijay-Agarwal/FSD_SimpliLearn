package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;


public class StudentDao {
	
/**
 * @param student
 * @return
 */
public static boolean storeStudentInfo(Student student) {
	try {
	Configuration con=new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory sf =con.buildSessionFactory(); //Like A Connection
	Session session=sf.openSession(); //Like Statement or Prepared Statement
	Transaction tran=session.getTransaction();
	tran.begin();	
		session.save(student);//Insert Query
	tran.commit();
	} catch (Exception e) {
		System.out.println(e);
		return false;
		}
	return true;
	}

}
