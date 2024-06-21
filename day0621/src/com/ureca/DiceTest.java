package com.ureca;

import java.util.Arrays;
import java.util.Scanner;

//DFS
public class DiceTest {
	
	static int N, numbers[]; //N:주사위 던지는 수, numbers:던져진 주사위 수들
	static boolean[] isSelected; //이전 선택했던 값인지 체크
	
	public static void main(String[] args) {
		
		//입력으로 주사위 던지는 횟수, 주사위 던지기 모드(1,2,3,4)
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();//주사위 던지는 횟수(0<N<7)
		int M = sc.nextInt();//주사위 던지기 모드
		numbers = new int[N];//던져진 횟수의 결과값을 배열로 저장
		
		switch(M) {
			case 1:{//중복순열
					dice1(0);
					} break; 
			case 2:{//순열 
					isSelected = new boolean[7];
					//6개의 수에 대한 중복(선택)확인
					dice2(0);
					} break; 
			case 3:{//중복조합
					
					dice3(0,0);
				
					} break; 
			case 4:{//조합
				
					dice4(0,1);
				
					} break; 
		}
		sc.close();
	}//main

	private static void dice1(int depth) {
		//끝마칠 조건(수의 조합이 끝났어요
		if(depth==N){//원하는 만큼 주사위를 던졌다면 => 숫자 조합이 완성 되었다면
			System.out.println(Arrays.toString(numbers));
			return;
		}
		//=============================
		//공통적인 반복문
		for(int i=1; i<=6; i++){//무엇(무슨 데이터)을 뽑을건데? 주사위 눈
			//순열/조합저장변수 = 데이터
			numbers[depth] = i;
			dice1(depth+1);
		}
	}//dice1
	private static void dice2(int depth) {
		// TODO Auto-generated method stub
		if(depth==N){//원하는 만큼 주사위를 던졌다면 => 숫자 조합이 완성 되었다면
			System.out.println(Arrays.toString(numbers));
			return;
		}//if문
		//=============================
		//공통적인 반복문
		for(int i=1; i<=6; i++){//무엇(무슨 데이터)을 뽑을건데? 주사위 눈
			//순열/조합저장변수 = 데이터
//			if(!isSelected[i]) {
//				numbers[depth] = i;
//			}
			if(isSelected[i]) {
				continue;
			}//if문
			numbers[depth] = i;//수를 선택
			isSelected[i] = true;
			
			dice2(depth+1);
			
			isSelected[i] = false;//생성되어진 순열 숫자의 사용이 끝났다면
		}//for문
	}//dice2
	private static void dice3(int depth, int start) {//start:시작 주사위 눈의 수
		if(depth==N){
			System.out.println(Arrays.toString(numbers));
			return;
		}//if문
		
		for(int i=start; i<=6; i++){
			numbers[depth] = i;
			dice3(depth+1, i);
		}//for문
	}//dice3
	private static void dice4(int depth, int start) {
		if(depth==N){
			System.out.println(Arrays.toString(numbers));
			return;
		}//if문
		
		for(int i=start; i<=6; i++){
			numbers[depth] = i;
			dice3(depth+1, i+1);
		}//for문
	}//dice4
}//end class
