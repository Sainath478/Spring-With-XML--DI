package com.demo;

public class Subject {
	
	@Override
	public String toString() {
		return "Subject [sub_code=" + sub_code + ", sub_name=" + sub_name + ", standared=" + standared + "]";
	}

	private int sub_code;
	private String sub_name;
	private int standared;
	
	public Subject() {
	}

	public int getSub_code() {
		return sub_code;
	}

	public void setSub_code(int sub_code) {
		this.sub_code = sub_code;
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	public int getStandared() {
		return standared;
	}

	public void setStandared(int standared) {
		this.standared = standared;
	}

	public Subject(int sub_code, String sub_name, int standared) {
		super();
		this.sub_code = sub_code;
		this.sub_name = sub_name;
		this.standared = standared;
	}

}
