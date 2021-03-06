package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Employee;

@Controller
public class EmployeeController {
	@RequestMapping(value = "openEmployeStore",method = RequestMethod.GET)
	public ModelAndView openStorePage(@ModelAttribute("empRef") Employee emp) {	// DI for Employee class
		ModelAndView mav = new ModelAndView();							// employee class store in model scope with key name is empRef.
		mav.setViewName("employeeStore.jsp");
		return mav;
	}
	
	@RequestMapping(value = "storeEmployee",method=RequestMethod.POST)
	public ModelAndView storeEmployee(@ModelAttribute("empRef") Employee emp) {
		ModelAndView mav = new ModelAndView();							// employee class store in model scope. 
		System.out.println("id is "+emp.getId());
		System.out.println("name is "+emp.getName());
		System.out.println("salary is "+emp.getSalary());
		mav.setViewName("employeeStore.jsp");
		return mav;	

}
}
