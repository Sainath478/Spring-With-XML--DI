package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.Country;
import com.demo.Student;

public class Stu_Country_Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");

		Student s = context.getBean(Student.class);
		
		@SuppressWarnings("unused")
		Country e = context.getBean(Country.class);
		
		System.out.println(s);

		

	}

}
