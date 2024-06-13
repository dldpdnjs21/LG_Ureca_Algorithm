package com.ureca.Mission;

import java.util.Arrays;

public class Mission1 {

	public static void main(String[] args) {
		int su[] = {13, 8, 7, 10, 100, 5};
		int temp;
		
		System.out.print("오름차순 정렬\n"+"===>");
		
//		##for문
		for(int i=0; i<su.length; i++) {
			for(int j=i+1; j<su.length; j++) {
				if(su[i]>su[j]) {
					temp = su[i];
					su[i] = su[j];
					su[j] = temp;
				}
			}
		}
//	   	##sort정렬
//		Arrays.sort(su);
		System.out.print(Arrays.toString(su));	
	}
}
