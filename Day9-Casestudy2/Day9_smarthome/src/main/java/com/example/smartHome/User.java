package com.example.smartHome;

import org.springframework.stereotype.Component;

@Component
public class User{
	private String name="Vishnu";
	private String homeid="Home452";
	
	public String getName() {
		return name;
	}
	public String getHomeid() {
		return homeid;
	}
	
	
}