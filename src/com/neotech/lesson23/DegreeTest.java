package com.neotech.lesson23;

public class DegreeTest {

	public static void main(String[] args) {

		Degree dg = new Degree();
		dg.getPrerequisite();
		
		
		Bachelors bs = new Bachelors();
		bs.getPrerequisite();
		
		
		Masters ms = new Masters();
		//we are overriding. we are calling the getPrerequisite() of the Masters class
		ms.getPrerequisite();
		
		
		
		
	}

}
