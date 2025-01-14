package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.Subject;
import com.demo.Teacher;

public class Teacher_SubMain {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("teachersubject.xml");

		Teacher t = con.getBean(Teacher.class);
		Subject s = con.getBean(Subject.class);
		
		System.out.println(t);

	}

}
