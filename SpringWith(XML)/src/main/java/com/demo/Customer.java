package com.demo;

public class Customer {
	
	private String cus_name;
	private String payment_method;
	
	private Order order;
	
	public Customer() {
	}

	@Override
	public String toString() {
		return "Customer [cus_name=" + cus_name + ", payment_method=" + payment_method + ", order=" + order + "]";
	}

	public String getCus_name() {
		return cus_name;
	}

	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Customer(String cus_name, String payment_method, Order order) {
		super();
		this.cus_name = cus_name;
		this.payment_method = payment_method;
		this.order = order;
	}
	
	

}
