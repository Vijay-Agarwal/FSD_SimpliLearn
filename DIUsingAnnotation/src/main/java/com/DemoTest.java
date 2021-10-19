package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	private static ApplicationContext ac;

	public static void main(String[] args) {
		ac = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp=(Employee)ac.getBean("emp");
		System.out.println(emp);
		emp.setId(101);
		emp.setName("Raj");
		emp.setSalary(16000);
		Address add=emp.getAdd(); //Employee Class object call Using Getter Setter in Employee Class for Address Class 
		add.setCity("Meerut");
		add.setState("UP");
		System.out.println(emp);
	}

}
