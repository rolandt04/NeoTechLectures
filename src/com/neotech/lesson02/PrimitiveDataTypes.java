package com.neotech.lesson02;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		// There are 8 primitive data types in Java
		// to store whole numbers --> byte, short, int, long

		byte hakan = 9; // The range is -128 to 127, total of 256 different value

		// compiler will give an error
		// byte baris = 145;

		short hakan2 = 2457; // range -32768 to 32767

		// compiler will give an eerror
		// short var4 = 35.6;

		int viktor = -2433453; // the range -2 billion to +2 billion
		int esat = 3; // yes I can store small numbers in an int

		// if the number is bigger than 2billion we have to use long
		// if the number is bigger than 2billion we have to use L at the end
		long elionBankBalance = 92374293457927594L;

		System.out.println(elionBankBalance);

		// to store decimal numbers we use float or double
		float rahime = 23.456F; // you must use F or f at the end

		double rahime2 = 23.456; // you DON'T need F at the end

		System.out.println(rahime);
		System.out.println(rahime2);

		// to store a single character we use char
		char var3 = 'P';
		char var4 = '%';
		char var5 = 'p';
		char var6 = ' '; // this is the space character

		// compiler will give an error
		// char var7 = 'gg';

		char var8 = '2';

		// to store boolean values (true/false)
		boolean ali = false;

	}
}
