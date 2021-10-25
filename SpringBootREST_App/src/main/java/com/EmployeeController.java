package com;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
@RequestMapping(value="empInfo",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)	
public Employee getEmpInfo() {
	Employee emp=new Employee(100,"Ravi",120000);
	return emp;
}
}
