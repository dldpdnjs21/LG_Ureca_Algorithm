package com.uplus;

public class Q5 {
	public static void main(String[] args) {
		System.out.print("[");
		for(int i=5; i<=20; i+=5) {
			System.out.print(i + " ");
			
			if(i<20)
				System.out.print(", ");
		}
		System.out.print("]");
		
	}
}
