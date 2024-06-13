package com.ureca;

public class ConstructorTest {
	public static void main(String[] args) {
		Abc a = new Abc();
		a.hello();
		
		System.out.println("str="+a.str);
		//1)String str;에 의해 null값 출력
		//3)this("ureca")를 첫문장에 써주면 null이 아닌 "ureca" 문장이 출력된다
		
		Abc a2 = new Abc("Java");
		System.out.println("a2.str="+a2.str);
		//2)
		//"Java"가 아닌 null값이 출력되는 이유
		//field str~>member str보다 field str~>지역변수의 str의 거리가 더 가깝다
		//member를 사용하려면 변수명을 다르게 해야한다
	
	}
}

