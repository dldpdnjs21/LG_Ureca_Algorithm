package com.uplus;

public class LeapYearTest {
	public static void main(String[] args) {
		
		int year = 2022;
		boolean b1 = (year%4) == 0;
		boolean b2 = (year%100) != 0;
		
		boolean b3 = (year%400) == 0;
		
		System.out.println((b1 && b2) || b3);
	}
}

