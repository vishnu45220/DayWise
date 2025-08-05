package com.example.smartHome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutomationService {
	
	@Autowired
	private User user;
	
	@Autowired
	private Device device;
	
	public void controlDevice(String command)
	{
		System.out.println("User: "+user.getName()+",Home id:"+user.getHomeid());
		
		
		if("on".equalsIgnoreCase(command)) {
			device.turnOn();
		}
		else {
			device.turnOff();
		}
	}
	

}
