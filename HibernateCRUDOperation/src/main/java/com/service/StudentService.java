//Service layer is responsible for pure business logic

package com.service;

import java.util.List;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {

	StudentDao studentDao = new StudentDao();
	
	public String storeStudentInfo(Student student) {
		try {
			if(StudentDao.storeStudentInfo(student)) {
				return "Record stored successfully";
			}else {
				return "Record didn't store";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String updateStudentInfo(Student student) {
		if(studentDao.updateStudentInfo(student)>0) {
			return "Student info updated successfully";
		}else {
			return "Student details didn't update";
		}
	}
	
	public String deleteStudentInfo(int sid) {
		if(studentDao.deleteStudentInfo(sid)>0) {
			return "Record deleted successfully";
		}else {
			return "REcord not present";
		}
	}
	
	public Student getStudentInfo(int sid) {
		return studentDao.getStudentInfo(sid);
	}
	
	public List<Student> getAllStudentDetails() {
		return studentDao.getAllStudents();
	}
	
	
}
