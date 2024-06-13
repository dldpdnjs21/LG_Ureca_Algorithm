package com.ureca;

import java.util.Scanner;
//==========================================================
//[문제]
//배열을 이용하여 사람의 이름을 저장, 삭제, 수정, 검색하는 클래스를 작성하시오. 
//- 최대 5명의 이름을 입력.    
//==> String []names = new String[5];
//- 저장된 이름은 서로 겹치지 않는다는 가정
//==========================================================
public class NameMenuTest {
	public static void main(String[] args) {
		//화면출력, 사용자 데이터 입력
		//==> Scanner VS BufferedReader
		
		Scanner sc = new Scanner(System.in);
		NameMenu menu = new NameMenu();
		
		int no;
		
		do {
			System.out.print("<이름메뉴>\r\n"
					+ "1.추가 2.검색 3.수정 4.삭제 5.종료\r\n"
					+ "번호입력==> ");
			
			no = sc.nextInt(); //번호입력
			
			System.out.println();
			
			switch (no) {
			case 1: {
					System.out.print("이름입력: ");
					String name = sc.next(); //이름입력 NameMenu.java에서 배열로 처리
					//sc.nextInt()	 sc.nextDouble()	 sc.next() ==> whiteSpace를 구분자로 데이터를 입력
					//	정수입력			 실수입력			   문자열
					
					//sc.nextLine() ==> 라인(줄)을 구분자로 데이터를 입력
					// 	 문자열
					menu.create(name);
					}//영역괄호
					break;
					
			case 2: 
					String []names = menu.read();
					System.out.println("#이름목록");
					for(String name:names) {
						if(name != null) //출력화면에 null 표시 X
						System.out.println(" "+name);
					}
					break;
			case 3: 
					System.out.print("기존이름입력: ");
					String oldName = sc.next();
					System.out.print("변경이름입력: ");
					String newName = sc.next();
					
					menu.update(oldName, newName);
					break;
			case 4: 
					System.out.print("삭제이름입력: ");
					String delName = sc.next();
					
					menu.delete(delName);
					break;
			}//switch
			
			System.out.println();
			
		} while(no!=5); //(no<5)
	
		System.out.println("--END--");
		sc.close(); //입력객체 반환
		
		//<클래스작성>
		//NameMenuTest.java
		// - main()포함
		//   ---> 반복되는 메뉴 출력
		//   ---> 번호입력(1~5), 추가 수정 삭제에 필요한 이름 입력	
	} //main
}