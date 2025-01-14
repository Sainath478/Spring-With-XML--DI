package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.Login;
import com.demo.User;

public class User_loginMain {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("userlogin.xml");

		User u = con.getBean(User.class);
		Login l = con.getBean(Login.class);
		
		System.out.println(u);

	}

}
