package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.StudentDao;
import com.bean.Student;

@Service //Service Layer Annotation (No need to create object of Dao layer now)
public class StudentService {
	@Autowired
	StudentDao studentDao;
	
	public String storeStudentInfo(Student std)
	{
		if(studentDao.storeStudentRecord(std)>0) {
			return "Stored";
		}else {
			return "Didn't store";
		}
	}
public List<Map<String,Object>> getAllStudentInfo(){
	return studentDao.retrieveStudentInfo();
}

}
