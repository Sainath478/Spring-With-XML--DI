package com.demo;

public class Login {
	
	private int login_id;
	
	
	public Login() {
	}


	@Override
	public String toString() {
		return "Login [login_id=" + login_id + "]";
	}


	public int getLogin_id() {
		return login_id;
	}


	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}


	public Login(int login_id) {
		super();
		this.login_id = login_id;
	}
	

}
