//	bin\com\lguplus\MethodCallTest.java

package com.lguplus;


public class MethodCallTest {
	
	static void good() {
		System.out.println("good클래스 안녕");
	}
	
//	static class B() {
//		System.out.println("B클래스 안녕");
//	}//내부클래스
	
	public static void main(String[] args) {
		System.out.println("안녕, 유플러스~^0^");
		
		A.uplus();// static 멤버는 클래스명으로 접근
				// 클래스명.메서드();
		
		
		A a = new A();
		a.hello();// 클래스멤버는 참조변수(레퍼런스변수)로 접근
				  // 참조변수.멤버메서드();	
		
		good();
		
	}
	
}