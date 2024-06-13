package com.ureca;

public class InheritanceTest {
	public static void main(String[] args) {
		Child c = new Child();
		
		c.hello();
		c.hello("홍길동");
		c.print();
		System.out.println(c.su);
		
		c.toString();
		
//======================================================================	
//		Parent p1 = new Parent();
//		
//		Child c1 = new child();
//		
//		Parent p2;
//			p2 = c1; //왼쪽에 부모, 오른쪽에 자식이 있으면 컴파일 가능
//		
//		Child c2;
//			c2 = p1; //이 경우는 컴파일이 될 수도 안 될 수도 있다
//======================================================================	
	}
}
