package com.ureca.pack1;

public class Other {
	void callTest() {
		Parent p = new Parent();
		p.m1();
		p.m2();
		p.m3();
//		p.m4();//같은 클래스 X -> 에러발생
	}
}
