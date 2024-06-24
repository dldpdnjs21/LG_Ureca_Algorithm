package com.ureca;

import java.util.Scanner;

public class SquareNumberTest {
	
	static int callCnt;//몇번 재귀호출 => 몇번 연산되었는지?
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt(); //x의 n승
		
//		System.out.println(exp1(x,n));
		System.out.println(exp2(x,n));
		System.out.println("연산횟수:" + callCnt);
		
		sc.close();
	}//main

	private static long exp1(int x, int n) {
		++callCnt;
		if(n==1) return x;
		return x * exp1(x, n-1);
	}//exp1

	private static long exp2(int x, int n) {
		++callCnt;
		if(n==1) return x;
		
		long y = exp2(x, n/2);
		
		//지수가 홀수일때 한번 더 곱해줌
		return (n%2==0) ? y*y : y*y*x;
	}//exp1
}
