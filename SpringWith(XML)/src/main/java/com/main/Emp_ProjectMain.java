package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.Employee;
import com.demo.Project;

public class Emp_ProjectMain {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("EmpProject.xml");

		Employee e = context.getBean(Employee.class);
		
		@SuppressWarnings("unused")
		Project p = context.getBean(Project.class);
		
		System.out.println(e);


	}

}
