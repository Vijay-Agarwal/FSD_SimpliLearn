package com.service;

import java.util.List;
import com.bean.Student;
import com.dao.StudentDao;

public class StudentService {

	StudentDao studentDao = new StudentDao();
	
	public String storeStudentRecord(Student student) {
		if(student.getAge()<21) {
				return "Age must be > 21 year";
		}else if(studentDao.storeStudentRecord(student)>0) {
				return "Record stored successfully";
		}else {
			return "Record didn't store id must be unique";
		}
	}
	
	public List<Student> getAllStudent() {
		return studentDao.retrieveStudentRecord();
	}	
}
