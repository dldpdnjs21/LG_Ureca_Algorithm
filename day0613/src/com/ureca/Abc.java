package com.ureca;

public class Abc {
	
	int su; //== int su=0;
//	My my; //== My my=null;
	String str; //1)==String str=null;
	
	
	Abc(){ //(파라미터가 비어있으므로)기본생성자 : 초기화 메서드
		this("ureca"); //3)다른 생성자 호출 시 첫번째 문장으로 호출해야함
		su = 1000;
//		my = new My();
	}
	
	Abc(String str){ //(파라미터 다르게 생성)오버로딩 생성자
		//오버로딩 생성자만 있으면 에러 발생
//		str=str; //지역변수 호출
		this.str=str;//2)멤버변수 호출
		//2)(String s 바꾸고)str=s; 
	}
	
	void hello() {
		System.out.println("안녕");
	}
}
