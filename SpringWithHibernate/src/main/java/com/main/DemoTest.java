package com.main;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Students;
import com.bean.Trainer;
import com.service.TrainerService;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Trainer t1=(Trainer)ac.getBean("trainer");
		t1.setTid(3);
		t1.setTname("Ramu");
		t1.setTech("Angular");
		List<Students>listOfStd=new ArrayList<>();
		Students s1=(Students)ac.getBean("students");
		s1.setSid(3);
		s1.setSname("Yash");
		s1.setAge(22);
		s1.setTsid(3);
		
		Students s2=(Students)ac.getBean("students");
		s2.setSid(4);
		s2.setSname("Rahul");
		s2.setAge(24);
		s2.setTsid(3);
		listOfStd.add(s1);
		listOfStd.add(s2);
		
		t1.setListOfStd(listOfStd);
		TrainerService ts=(TrainerService)ac.getBean("trainerService");
		String res=ts.storeTrainerInfo(t1);
		System.out.println(res);

	}

}
