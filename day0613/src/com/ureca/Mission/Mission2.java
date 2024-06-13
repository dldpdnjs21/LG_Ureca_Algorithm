package com.ureca.Mission;

import java.util.Arrays;

public class Mission2 {
	public static void main(String[] args) {
		char[] ch = {'J','a','v','A'};
		String[] names = {"홍길동","길라임","김주원"};
	
		System.out.print("오름차순 정렬\n"+"===>");
		
		Arrays.sort(ch);
		for(char data:ch) {
			System.out.print(data+" ");
		}
		
		System.out.print("\n오름차순 정렬\n"+"===>");
		
		Arrays.sort(names);
		for(String data:names) {
			System.out.print(data+" ");
		}
	}
}
