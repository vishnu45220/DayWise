package com.example.smartHome;

import org.springframework.stereotype.Component;

@Component
public class Device {
	private String deviceType="Tv";
	private String status="off";
	
	public void turnOn()
	{
		status="On";
		System.out.println(deviceType+ "turned"+status);
	}
	
	public void turnOff()
	{
		status="off";
		System.out.println(deviceType+"turned"+status);
	}
	

}
