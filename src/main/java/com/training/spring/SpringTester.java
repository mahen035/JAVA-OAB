package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTester {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee emp = (Employee)context.getBean("employee");
		Department dept = (Department)context.getBean("dept");
		System.out.println(emp.getEmpName()+":"+emp.getEmpId());
		System.out.println(dept.getDeptName());
		System.out.println(emp.getEmpDetails());

	}

}
