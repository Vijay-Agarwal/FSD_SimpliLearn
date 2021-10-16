package com.main;

import com.entity.Student;
import com.service.StudentService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ss=new Student();
		ss.setId(4);
		ss.setName("Vijay");
		StudentService ser=new StudentService();
		String result=ser.storeStudentInfo(ss);
		System.out.println(result);
		

	}

}
