package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTester {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee emp = (Employee)context.getBean("employee");
		System.out.println(emp.getEmpName());

	}

}
