package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee emp=new Employee();
//		emp.display();
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");  //ApplicationContext  is Interface,ClassPathXmlApplicationContext is pre-defined Class 
		Employee emp1=(Employee)ac.getBean("Emp1"); //used to pull objects from beans
//		emp1.display();
//		Employee emp2=(Employee)ac.getBean("Emp1"); //used to pull objects from beans
//		emp2.display();
//		
//		Employee emp3=(Employee)ac.getBean("Emp2"); //used to pull objects from beans
//		emp3.display();
//		Employee emp4=(Employee)ac.getBean("Emp2"); //used to pull objects from beans
//		emp4.display();
		
		System.out.println(emp1);//Default Constructor
		Employee emp5=(Employee)ac.getBean("Emp3"); //used to pull objects from beans
		//emp5.display();
	
		System.out.println(emp5);//para-meterized constructor
	}
}
