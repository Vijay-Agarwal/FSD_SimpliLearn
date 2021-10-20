package com.main;

import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;
import com.service.StudentService;

public class demoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
Student std =(Student)ac.getBean("student");
std.setId(11);
std.setName("Raj");
std.setAge(30);
StudentService ss = (StudentService)ac.getBean("studentService");
//String res = ss.storeStudentInfo(std);
//System.out.println(res);
List<Map<String, Object>> listInfo=ss.getAllStudentInfo();
//System.out.println(listInfo);
for (Map<String,Object>mm:listInfo) {
	Set<Map.Entry<String,Object>>ii=set.iterator();
	while(ii.hasNext())
	{
		System.out.println(ii.next());
	}
}
	
	}
}
