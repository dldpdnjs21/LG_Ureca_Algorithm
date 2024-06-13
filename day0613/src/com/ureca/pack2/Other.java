package com.ureca.pack2;

import com.ureca.pack1.Parent;

public class Other {
	void callTest() {
		Parent p = new Parent();//import를 통해 에러해결
		p.m1();
//		p.m2();//자식클래스가 아니기 때문에 에러발생
//		p.m3();//서로 다른 패키지이기 때문에 에러발생 
//		p.m4();//같은 클래스 X이기 때문에 에러발생
	}
}
