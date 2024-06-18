package com.ureca;

class Parent{
	public Parent() {
		System.out.println("부모 기본생성자");
	}
	void good() {
		System.out.println("좋아요:)");
	}
}

class Child extends Parent{
	public Child() {
		//super(); // 생략되어 있음
		System.out.println("자식 기본생성자");
	}
}

public class ConstructorCallTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.good();
	}
}
