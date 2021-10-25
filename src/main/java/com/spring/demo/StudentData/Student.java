package com.spring.demo.StudentData;

import java.util.LinkedHashMap;

public class Student {

	private String lastName;
	private String firstName;
	private String country;
	
	
	private String countryoptimized;
	
	private LinkedHashMap<String, String> countryOptions;
	
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("TN", "Tunisia");
		countryOptions.put("US", "United States");
		countryOptions.put("FR", "France");
		countryOptions.put("AU", "Austalia");

	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getCountryoptimized() {
		return countryoptimized;
	}
	public void setCountryoptimized(String countryoptimized) {
		this.countryoptimized = countryoptimized;
	}
	
	
}
