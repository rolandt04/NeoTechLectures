package com.neotech.lesson15;

public class Phone {

//	Create a Class "Phone". Create 3 Objects of it: 
// iPhone, Android, Nokia with specific  attributes and behaviors.

	//attributes
	String brand;
	String color;
	String model;
	int price;
	
	//behaviors
	
	void call()
	{
		System.out.println(brand + " is calling!");
	}
	
	void text()
	{
		System.out.println(brand + " is texting!");
	}
	
	void navigate()
	{
		System.out.println(brand + " is navigating!");
	}
	
}
