package com.example.online;

public class FoodOrderingservice {
	private Customer customer;
	private Resturant resturant;
	public FoodOrderingservice(Customer customer, Resturant resturant) {
		this.customer = customer;
		this.resturant = resturant;
	}
	public void placeorder()
	{
		System.out.println("Customer: "+customer.getName());
		System.out.println("prefered cuisine: "+customer.getPreferred());
		
		
		if(customer.getPreferred().equalsIgnoreCase(resturant.getCuisine()))
		{
			System.out.println("order placed at"+resturant.getName()+"("+resturant.getLocation()+")");
			
		}
		else
		{
		System.out.println("No matchinmg cuisine avilable: "+resturant.getName());	
		}
	}
	
	
	

}
