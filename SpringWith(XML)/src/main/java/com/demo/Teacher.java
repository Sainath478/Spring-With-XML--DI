package com.demo;

public class Teacher {
	
	private int teach_id;
	private String teach_name;
	private int salary;
	
	private Subject sub;
	
	public Teacher() {
	}

	@Override
	public String toString() {
		return "Teacher [teach_id=" + teach_id + ", teach_name=" + teach_name + ", salary=" + salary + ", sub=" + sub
				+ "]";
	}

	public int getTeach_id() {
		return teach_id;
	}

	public void setTeach_id(int teach_id) {
		this.teach_id = teach_id;
	}

	public String getTeach_name() {
		return teach_name;
	}

	public void setTeach_name(String teach_name) {
		this.teach_name = teach_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}

	public Teacher(int teach_id, String teach_name, int salary, Subject sub) {
		super();
		this.teach_id = teach_id;
		this.teach_name = teach_name;
		this.salary = salary;
		this.sub = sub;
	}
	

}
