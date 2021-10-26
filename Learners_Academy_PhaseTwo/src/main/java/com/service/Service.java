package com.service;

import java.util.List;

import com.dao.Dao;

import entity.User;
import entity.student;
import entity.subject;
import entity.teacher;

public class Service {
	private Dao dao= new Dao();
	
	public int validateUser(String name,String password)
	{
		int x=0;
		String firstname="";
		List<User> userlist=dao.getUsers();
		for(User u:userlist)
			if(u.getUsername().equals(name))
				if(u.getPassword().equals(password))
					x++;
		return x;
	}
	public int signUp(String newpass,String repass,String username,String firstname,String lastname)
	{
		User user=new User(firstname,lastname,username,newpass);
    	return dao.signUp(user);
	}
	public boolean addStudent(student stud)
	{
		return dao.addStudent(stud);
	}
	
	public boolean addSubject(subject sub)
	{
		return dao.addSubject(sub);
	}
	
	public boolean addTeacher(teacher t1)
	{
		return dao.addTeacher(t1);
	}
	
	public int deleteSubject(int sub)
	{
		return dao.deleteSubject(sub);
	}
	public int deleteStudent(int stu)
	{
		return dao.deleteStudent(stu);
	}
	public int deleteTeacher(int tea)
	{
		return dao.deleteTeacher(tea);
	}
}
