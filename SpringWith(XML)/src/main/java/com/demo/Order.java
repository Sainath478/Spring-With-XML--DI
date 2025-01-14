package com.demo;

public class Order {
	
	private int order_id;
	private String order_name;
	private String order_date;
	
	public Order() {
	}

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", order_name=" + order_name + ", order_date=" + order_date + "]";
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getOrder_name() {
		return order_name;
	}

	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public Order(int order_id, String order_name, String order_date) {
		super();
		this.order_id = order_id;
		this.order_name = order_name;
		this.order_date = order_date;
	}

}
