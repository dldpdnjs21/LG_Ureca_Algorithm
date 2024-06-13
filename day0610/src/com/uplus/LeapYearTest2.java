package com.uplus;
import java.util.Scanner;
public class LeapYearTest2 {
	public static void main(String[] args) {
		//java.lang => 기본 패키지
		//java.lang.String	java.lang.System
		//현클래스와 동일한 패키지에 있는 클래스 또는 기본 패키지에 있는 클래스는 바로 사용이 가능
		//==> 이외의 클래스는 import가 필요 : 클래스의 위치를 표현하는 방법
		//java.util.Scanner ==> import java.util.Scanner;
		
		System.out.print("년도입력==> ");
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0) {
			System.out.println(year + "년은 윤년입니다");
		}else {
			System.out.println(year + "년은 평년입니다");
		}
		sc.close();
	}
}