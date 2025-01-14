package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.Customer;
import com.demo.Order;

public class Cus_OrderMain {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("customerOrder.xml");
		
		Customer c = con.getBean(Customer.class);
		
		Order o = con.getBean(Order.class);
		
		System.out.println(c);


	}

}
