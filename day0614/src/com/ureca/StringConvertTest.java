package com.ureca;

public class StringConvertTest {//문자열 변환 테스트

   static void convert1() {
	  String s1="우리나라";
	  String s2="대한민국만세!!";	  
	  s1=s1+s2;
	  /*
	     String클래스: 고정문자열!!
	     1. String클래스 객체 생성
	     2. 문자열변환을 위해서 임시로 StringBuilder클래스 객체 생성
	     3. append()메소드 호출
	     4. StringBuilder객체를 String객체로 변환
	     5. 임시생성된 StringBuilder객체를 소멸.	 	          
	   */
	  
	  System.out.println(s1);
   }//convert1
   
   
//   String s1,s2,s3,s4,s5;
//   s1+s2+s3+s4+s5;
//   str.append(s1)
//   str.append(s2)
//   str.append(s3)
//   str.append(s4)
//   str.append(s5)
   
   static void convert2() {
	  StringBuilder s1 = new StringBuilder("우리나라"); 
	  s1.append("대한민국만세!!");
	  /*
	     StringBuilder클래스: 가변문자열!!
	     1. StringBuilder클래스 객체 생성
	     2. append()메소드 실행.
	   */
	  System.out.println(s1);
   }//convert2
   //Builder와 Buffer는 같은 기능이지만 Bruffer에는 동기화처리 과정이 있어 좀 더 느리다
   
   public static void main(String[] args) {
	  convert1();
	  System.out.println("----------------");
	  convert2();
   }//main
	
   

}



