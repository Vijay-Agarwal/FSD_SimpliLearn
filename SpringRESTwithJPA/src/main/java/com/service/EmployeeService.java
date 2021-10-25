package com.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.EmployeeDao;
import com.bean.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}
}