package com.demo;


public class Student {
	
	private int stu_id;
	private String stu_name;
	private int age;
	private String city;
	
	private Country con;
	
	
	public Student() {
	}


	public Student(int stu_id, String stu_name, int age, String city, Country con) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.age = age;
		this.city = city;
		this.con = con;
	}


	public int getStu_id() {
		return stu_id;
	}


	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}


	public String getStu_name() {
		return stu_name;
	}


	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Country getCon() {
		return con;
	}


	public void setCon(Country con) {
		this.con = con;
	}


	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", stu_name=" + stu_name + ", age=" + age + ", city=" + city + ", con="
				+ con + "]";
	}


	
}
