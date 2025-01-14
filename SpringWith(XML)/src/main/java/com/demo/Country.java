package com.demo;

public class Country {
	
	private int county_id;
	private String country_name;
	
	public Country() {
	}

	@Override
	public String toString() {
		return "Country [county_id=" + county_id + ", country_name=" + country_name + "]";
	}

	public int getCounty_id() {
		return county_id;
	}

	public void setCounty_id(int county_id) {
		this.county_id = county_id;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public Country(int county_id, String country_name) {
		super();
		this.county_id = county_id;
		this.country_name = country_name;
	}
	
	

}
