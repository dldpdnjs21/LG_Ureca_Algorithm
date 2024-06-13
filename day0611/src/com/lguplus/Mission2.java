package com.lguplus;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Mission2 {

	public static void main(String[] args) throws Exception {
		
		//#입력값#
		//0 1 0 0 1
		//1 3 5
		//==> 8개의 정수데이터가 두줄에 입력된다.
		//이 입력된 값을 arr[]에 저장하자
		
		System.out.println("#입력값#");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine(); //Scanner의 nextLine()과 동일한 동작 ==> 엔터로 구분
		//str = "0 1 0 0 1";
		
		String[] strArr = str.split(" "); //strArr={"0", "1", "0","0","1"};
		//==> 정규표현식(RegExpression)을 사용하는 split()메서드는 실행시간이 많이 걸린다.
		
		int arr[] = new int[strArr.length];
		
		for(int i =0; i<strArr.length; i++) {
			arr[i]=Integer.parseInt(strArr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
		//====================================================================
		  
		  
//		  StringTokenizer tokens = new StringTokenizer(String 기준문자열str, String 구분문자열delimiter);
//		  StringTokenizer tokens = new StringTokenizer(String 기준문자열str); ==>  공백을 구분자로 사용
		  
		  //str="0 1 0 0 1";
		  StringTokenizer tokens = new StringTokenizer(str," "); //구분자를 통해 구분된 각각의 데이터를 '토큰'이라고 표현
//		  StringTokenizer tokens = new StringTokenizer(str);
		       //tokens = [ 0,1,0,0,1 ]
//		  System.out.println(tokens.nextToken()); //[ 1,0,0,1 ]
//		  System.out.println(tokens.nextToken()); //[ 0,0,1 ]
//		  System.out.println(tokens.nextToken()); //[ 0,1 ]
//		  System.out.println(tokens.nextToken()); //[ 1 ]
//		  System.out.println(tokens.nextToken()); //[ ]
//		  
//		  System.out.println(tokens.nextToken()); //에러발생: NoSuchElementException
		  
		  //==> 알고리즘에서는 데이터의 갯수가 정해져 있으므로 for문을 사용하면 됨
		  //예)  for(int i=0; i<n; i++){   System.out.println(tokens.nextToken());   }
		  
		  while(tokens.hasMoreTokens()) {
			  System.out.println(tokens.nextToken());
		  }
	}//main

}





