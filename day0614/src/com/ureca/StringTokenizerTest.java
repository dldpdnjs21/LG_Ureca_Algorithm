package com.ureca;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	
  public static void main(String[] args) {
	//StringTokenizer : 문자열 데이터를 특정 구분자(delimiter)로 분리해주는 클래스
	  
	  //StringTokenizer(String str,String delim)
	  //str---> 기준문자열,   delim---> 구분자
	  //token(토큰): 분리된 각각의 데이터!!
	  
	 String tel="010--4567"; 
	 StringTokenizer st = new StringTokenizer(tel, "-");
	 //st=["010","123","4567"]
	 
	 //String nextToken()  
	 //String tel1 = st.nextToken();
	/* System.out.println(st.nextToken());
	 System.out.println(st.nextToken());
	 System.out.println(st.nextToken());*/ //==>전화번호와 같이 최대 길이가 명확하다면 사용
	 									   //아니라면 추가 데이터에 대한 오류가 발생한다
	 
	 //st=["010","123","4567"]
	 while(st.hasMoreTokens()) {//st에 토큰데이터를 가지고 있다면 true 리턴
		 System.out.println(st.nextToken());//토큰 데이터 뽑아오기
		 //==>반복문에 의해 추가 데이터가 생기더라도 토큰 데이터가 정상적으로 출력된다
		 
		 //nextToken() st=["123","4567"]
		 //nextToken() st=["4567"]
		 //nextToken() st=[]				 
	 } 
	 
	 //--------------------------------------------------
	 //String tel="010-123-4567";
	 //tel.split(String regex) : 특정문자를 통해 데이터를 분리!!
	 System.out.println("==================");
	 String [] tels = tel.split("-");//tels[]={"010","123","4567"};
	 for(int i=0; i<tels.length; i++) {
		 System.out.println("tels["+i+"]="+tels[i]);
	 }
	 //StringTokenizer와 split의 차이점
	 //split은 공백을 포함한다 예) 010--2345이면 나오는 데이터는 010,공백,2345
	 //하지만 토큰 데이터는 공백을 무시하기 때문에 010,2345로 구분되어 출력된다
	 
	 
  }//main

}







