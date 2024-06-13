package com.ureca.pack1;

public class Child extends Parent {
	void callTest(){
		m1(); //==this.m1();
		m2();
		m3();
//		m4();//같은 클래스 X (자식클래스도 마찬가지) -> 에러발생
	}
}
