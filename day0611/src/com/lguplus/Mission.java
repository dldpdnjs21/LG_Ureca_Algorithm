package com.lguplus;

public class Mission {
	public static void main(String[] args) {
		Q1(); Q2();
		Q3(); Q4();
		Q5(); Q6(); Q7();
		
	}
	static void Q1() {
		int su[] = {1,2,3,4,5};
		for(int i=0; i<5;i++) {
			System.out.print(su[i]+" ");
		}
		System.out.println();
	}
	static void Q2() {
		int su[] = {1,2,3,4,5};
		for(int i=5; i>0; i--) {
			System.out.print(su[i-1]+" ");
		}
		System.out.println();
	}
	static void Q3() {
		int su2[][] = {{1},{1,2},{1,2,3}};
		System.out.println(su2[0][0]);	
	}
	static void Q4() {
		int su3[]; //배열선언
		su3 = new int[4]; //배열초기화
		su3[2]=33;
		
		System.out.println(su3[2]);
		
	}
	static void Q5() {
		int su[] = {1,2,3,4,5};
		int n=su.length;
		for(int i=n-1; i>=0 ;i--) {
			System.out.print(su[i]+" ");
		}
		System.out.println();
	}
	static void Q6() {
		int su[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<10; i++) {
			if(i%2==1) {
				System.out.print(su[i]+" ");
			}
		}
		System.out.println();
	}
	
	static void Q7() {
		int su[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<10; i++) {
			if(su[i]%2==1) {
				System.out.print(su[i]+" ");
			}
		}
	}
}
