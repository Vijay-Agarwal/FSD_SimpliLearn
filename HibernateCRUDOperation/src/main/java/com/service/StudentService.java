package com.service;

import com.dao.StudentDao;
import com.entity.Student;


public class StudentService {
	StudentDao studentDao = new StudentDao();
	public String storeStudentInfo(Student student) {
		if(StudentDao.storeStudentInfo(student)) {
			return "Stored Successfully";
		}else {
			return "Didn't Stored Successfully";
		}
	}
}
