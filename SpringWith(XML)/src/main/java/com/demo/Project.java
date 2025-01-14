package com.demo;

public class Project {
	
	private int poject_id;
	private String project_name;
	private String start_date;
	private int valadity;
	
	public Project() {
	}

	@Override
	public String toString() {
		return "Project [poject_id=" + poject_id + ", project_name=" + project_name + ", start_date=" + start_date
				+ ", valadity=" + valadity + "]";
	}

	public int getPoject_id() {
		return poject_id;
	}

	public void setPoject_id(int poject_id) {
		this.poject_id = poject_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public int getValadity() {
		return valadity;
	}

	public void setValadity(int valadity) {
		this.valadity = valadity;
	}

	public Project(int poject_id, String project_name, String start_date, int valadity) {
		super();
		this.poject_id = poject_id;
		this.project_name = project_name;
		this.start_date = start_date;
		this.valadity = valadity;
	}
	

}
