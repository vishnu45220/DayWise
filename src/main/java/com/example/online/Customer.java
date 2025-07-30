package com.example.online;

public class Customer {
	
	private String name;
	private String contact;
	private String preferred;
	public Customer(String name, String contact, String preferred) {
		this.name = name;
		this.contact = contact;
		this.preferred = preferred;
	}
	public String getName() {
		return name;
	}
	public String getContact() {
		return contact;
	}
	public String getPreferred() {
		return preferred;
	}
	
	
	

}
