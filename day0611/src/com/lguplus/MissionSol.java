package com.lguplus;

import java.util.Arrays;

public class MissionSol {
	public static void main(String[] args) {
		int su[] = {1,2,3,4,5};
		
		int n=su.length; //알고리즘용
		System.out.println("첫번째 방법");
		for(int i=0; i<n; i++) {
			System.out.println(su[i]);
		}
		
		//나는 인덱스에 관심없고 데이터에만 관심이 있다
		//==> 개선된 for문(forEach문)을 사용
		//==> 형식)for(자료형 변수명:배열명){}
		System.out.println("두번째 방법");
		for(int data:su) {
			System.out.println(data);
		}
		
		int su2[][] = {{1},{1,2},{1,2,3}};
		for(int i=0; i<su2.length; i++) {
			for(int j=0; j<su2[i].length; j++) {
				System.out.println("su2["+i+"]["+j+"]번지 = "+su2[i][j]);
			}
		}
		
		
		//방법#1
//		int su3[];
//		su3 = su; //배열의 주소를 복사(얕은 복사)
				  //동일한 메모리를 su3과 su가 참조!!
		
		//방법#2
//		int su3[] = new int[su.length]; // 깊은 복사
//										//다른 메모리를 할당, 배열 각각의 번지 내의 데이터를 복사
		
		//방법#3
//		int su3[] = su.clone(); //배열 깊은 복사 : object.clone();
		
		//방법#4
		//System.arraycopy(); ==> 속도가 빠르다
//		int su3[] = System.arraycopy(Object src,
//				int srcPos, Object dest, int destPos, int length);		
		
//		System.arraycopy(su, 0, su3, 0, su.length);
		
		//방법#5 ==> 방법#4와 같음
		int su3[] = Arrays.copyOf(su, su.length);
		//Arrays.copyOfRange(배열original, 시작인덱스from, 복사할 길이to)
		//int su3[] = Arrays.copyOfRange(su, 0, su.length);
		//System.arraycopy()메소드를 편리하게 사용하도록 만든 메소드
		
		
		//배열의 값만 (for문을 사용하지 않고)쉽게 출력
		// ==> java.util.Arrays.toString(배열);
		System.out.println("su3배열>>>"+Arrays.toString(su3));
		System.out.println("su3배열>>>"+su3);
		System.out.println("su배열>>>"+Arrays.toString(su));

		
		for(int i=0; i<su.length; i++) {
			su3[i]=su[i];
		}
		
		System.out.println("#su3배열 데이터출력#");
		
		for(int data:su3) {
			System.out.println(data);
		}
		
		su3[2]=33;
		
		System.out.println("#su3[2]번지 데이터출력=>"+su3[2]);
		System.out.println("#su2[2]번지 데이터출력=>"+su[2]);
		
		
		System.out.println("=========================================");
		
		System.out.println("문제5)");
		
		int half = su.length/2;
		int temp;
		
		for(int i=0, j=su.length-1; i<half; i++, j--) {
			
			//swap 작업
			temp = su[i];
			su[i] = su[j];
			su[j] = temp;
			System.out.print(su[i]+" ");
		}
		
		
		System.out.println("\n문제6)");
		
		for(int i=0; i<su.length; i++) {
			if(i%2==1) {
				System.out.print(su[i]+" ");
			}
		}
		
		System.out.println("\n문제7)");
		
		for(int i=0; i<su.length; i++) {
			if(su[i]%2==1) {
				System.out.print(su[i]+" ");
			}
		}	
	}
}
