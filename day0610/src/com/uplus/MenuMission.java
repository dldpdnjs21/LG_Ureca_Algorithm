package com.uplus;
import java.util.Scanner;

public class MenuMission {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<<메뉴>>");
		int no = 0;
		int input;
		
		do{
			System.out.println("1.검색 2.증가 3.감소 4.종료");
		    System.out.print("번호==> ");
		     
		    input = sc.nextInt();
		     
		    if(input==1) {
		    	System.out.println("#검색결과:"+no);
		    	} else if(input==2) {
		    		System.out.println("#1증가하였습니다.");
		    		no++;
		    	} else if(input==3) {
		    		System.out.println("#1감소하였습니다.");
		    		no--;
		    		} else if(input==4){
		    			System.out.println("--END--");
		    			break;
		    			} else
		    				System.out.println("다시입력하세요.");
		    } while(input!=0);
		
		sc.close();
	}
}