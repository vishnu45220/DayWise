package com.example.online;

import java.beans.BeanProperty;

import org.springframework.context.annotation.Bean;

//import java.beans.BeanProperty;

@Configuration
public class AppConfig {
	
	@Bean
	public Customer customer()
	{
		return new Customer("Vishnu", "78672672", "italian");
	}
	
	@Bean
	public Resturant resturant()
	{
		return new Resturant("Mayura", "Kadapa", "italian");
	}
	
	@Bean
	public FoodOrderingservice foodOrderingservice()
	{
		return new FoodOrderingservice(customer(), resturant());
	}

}
