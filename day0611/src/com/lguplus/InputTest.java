package com.lguplus;

//import java.io.IOException;

public class InputTest {

	public static void main(String[] args) throws Exception { //throws IOException{
		
		System.out.print("한자리 수를 입력하세요: ");
		int su = System.in.read()-'0'; //-48;
				 
				 //엔터키 처리 문장
				 System.in.read(); //CR 13
				 System.in.read(); //LF 10
		//		 System.out.println("입력된 수="+su);
		
		System.out.println("su="+su);

		System.out.print("동일한 수를 다시 입력하세요: "); //실행했을때 입력 기회가 안주어지는 이유는 전 코드에서 '3'을 입력하고 'enter'를 눌렀을때
													//'enter'의 아스키코드도 buffer에 담겨 read에서 잡아가기 때문에 su2의 값이 -35 출력
													// 		<콘솔값>
													//		한자리 수를 입력하세요: 3
													//		su=3
													//		동일한 수를 다시 입력하세요: su2=-35

		int su2 = System.in.read()-'0'; //-48;
		System.out.println("su2="+su2);
		
		//checked 예외 ==> try~catch / throws를 사용
		//unchecked 예외 ==> 컴파일 시 에러 발생 XX
	}

}