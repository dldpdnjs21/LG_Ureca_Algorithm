//<<행운의 로또번호 생성기>>
//1. 서로 겹치지 않는 (중복되지 않는) 숫자 6개 생성
//2. 각 숫자는 1~45 범위내의 숫자
//3. 매번 실행시 다른 숫자 출력
//   ---> 랜덤수 : java.util.Random클래스 - nextInt(int bound)사용
//4. 다섯회 출력
//5. 각 번호는 오름차순 정렬
//   ---> java.util.Arrays클래스의 sort()메소드 사용.
//=> LottoTest.java
//출력형태)
//  ★★ 금주 행운의 로또번호 ★★
// 1회: 2, 12, 15, 34, 36, 42
// 2회: 1, 2, 9, 33, 42, 45
// 3회: 9, 12, 14, 19, 34, 40
// 4회: 5, 10, 15, 18, 19, 22
// 5회: 7, 9, 15, 19, 39, 41

package com.ureca.MissionSol;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Arrays;

public class Mission {
	public static void main(String[] args) {
		//Set ==> 중복된 데이터 제거
		Set<Integer> set = new TreeSet<>(); //HashSet<>();
		Random su = new Random();
		
		while(true) {
			set.add(su.nextInt(45)+1);
			if(set.size()==6) break;
		}
		
        for (int i=1; i<=6; i++) {
            int lotto[] = new int[6];
            for (int j=0; j<6; j++) {
                lotto[j] = su.nextInt(45) + 1;
            }
            
            Arrays.sort(lotto);
            System.out.print(i+"회차: ");
            
            
            String remov = Arrays.toString(lotto);
            String repl = remov.replaceAll("\\[","").replaceAll("\\]","");
            System.out.println(repl);
        }
    }
}


