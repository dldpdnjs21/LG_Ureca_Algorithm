package com.ureca;

public class Parent {//extends Object 정의되어 있다 (쓰지 않아도 된다)
   int su=300;
   
   //객체 생성 - new, static
   
   void hello() {
	   System.out.println("안녕");
   }
   void hello(String name) {//오버로딩
	   System.out.println("안녕,"+name);
   }
   void print() {
	   System.out.println("부모");
   }
}

