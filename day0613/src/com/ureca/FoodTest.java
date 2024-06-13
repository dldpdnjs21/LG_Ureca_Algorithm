package com.ureca;

public class FoodTest {
	public static void main(String[] args) {
//		MenuPan menu = new MenuPan(); //메모리 할당(=new) 뒤에는 인터페이스명을 쓸 수 없다. -> 에러발생
		MenuPan menu; //연결객체
		menu = new Hongkong(); //구현객체
		
		menu.짬뽕();
				
//		menu.초밥();
				
				
	}
}
