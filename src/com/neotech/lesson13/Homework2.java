package com.neotech.lesson13;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * 2. Create a 2D array that first row will contain 4 names and second row will
		 * contain grades, all Strings. Then your program should print name of the
		 * students that has A and B grade
		 */
		
		String[][] students = { 			
									{"Elmira", "Mustafa", "Dardan", "Oktay"}, 
									{"A", 		"B", 		"C", 		"B"} 
		
								};
		
		
		
		for (int i = 0; i < students[1].length; i++)
		{
			if(students[1][i].equals("A") || students[1][i].equals("B"))
			{
				System.out.println(students[0][i] + " " + students[1][i]);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
