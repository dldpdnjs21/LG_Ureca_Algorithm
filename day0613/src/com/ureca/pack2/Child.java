package com.ureca.pack2;

import com.ureca.pack1.Parent;

public class Child extends Parent {//import를 통해 에러해결
	void callTest(){
		m1(); //==this.m1();
		m2();
//		m3();//서로 다른 패키지이기 때문에 에러발생 
//		m4();//(자식클래스도 마찬가지로) 같은 클래스 X이기 때문에 에러발생
	}
}
