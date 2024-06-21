package com.ureca;

import java.util.Scanner;

public class BabyGinTest {
	
	static int N=6; //요수 개수
	static int[] num; //실행 중 입력
	static int[] ans; //생성된 순열을 저장
	
	static boolean[] selected; //뽑은 수는 다시 뽑지 않음 => 중복제거
	
	public static void main(String[] args) throws Exception {
		
//		System.setIn(new FileInputStream("babygin.txt"));
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
//		N=6; //베이비진의 전체 수 길이
		
		for(int tc=1; tc<=T; tc++) {
			ans = new int[N];
			num = new int[N];
			//"667767" ==> 문자열String
			
			selected = new boolean[N];
			char[] data = sc.next().toCharArray();
			
			//'6'==54    '6'-48 : 6    '6'-'0' : 6 /아스키코드
			for(int i=0; i<N; i++) {
				num[i] = data[i]-'0';
			}//for문
			
					
			boolean flag = go(0);
			if(flag)
				System.out.println("Baby-Gin");
			else
				System.out.println("Not Baby-Gin");
		}//tc for문
	}//main
	
	//연속된 3개의 수 검사 
	static boolean run(int[] cards) {
		return cards[2] == cards[1]+1 && cards[1] == cards[0]+1;
				
	}//run
	//동일한 3개의 수 검사 
	static boolean tri(int[] cards) {
		return cards[2] == cards[1] && cards[1] == cards[0];
					
	}//tri
	
	static boolean isBabyGin() {
		int[] leftCards = new int[] {ans[0],ans[1],ans[2]}; //좌측 카드
		int[] rightCards = new int[] {ans[3],ans[4],ans[5]}; //우측 카드
		
		return (run(leftCards) || tri(leftCards)) && (run(rightCards) || tri(rightCards));
	}//isBabyGin
		
	
	private static boolean go(int count) {
		if(count == N) { //순열의 조합이 끝났다면
//			isBabyGin();
//			return true;
			if(isBabyGin()) return true; //==return isBabyGin();
		}//if문
		for (int i = 0; i < N; i++) {
			if(!selected[i]) {
				selected[i] = true; //선택체크
				ans[count] = num[i];
				if(go(count+1)) return true;
				selected[i] = false;//선택 비체크
			}//if문
		}//for문
		return false;
	}//go
}//end class

//순열 : 순서의 의미가 있음
//조합 : 순서 의미 없음, 중복 X




