package com.neotech.lesson06;

public class Homework2 {

	public static void main(String[] args) {
		// Write a program to implement following logic using
		// if-else if-else statement:
		// if hour is less than 12 noon, greet with Good Morning
		// if hour is greater than or equal 12 noon but less than 3 pm, greet with Good
		// Afternoon
		// if hour is greater than or equal to 3 pm, greet with Good Evening

		int time = 12;

		if (time < 12) {
			System.out.println("Good Morning");
		} 
		else if (time < 15) 
		{
			System.out.println("Good Afternoon");
		} 
		else 
		{
			System.out.println("Good Evening");
		}

	}
}
