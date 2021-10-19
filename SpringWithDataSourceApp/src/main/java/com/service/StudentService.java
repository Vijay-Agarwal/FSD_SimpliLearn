package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //Service Layer Annotation (No need to create object of Dao layer now)
public class StudentService {
	@Autowired
	StudentDao stddao;
	
	public String storeStudentInfo(Student std)
	{
		
	}

}
