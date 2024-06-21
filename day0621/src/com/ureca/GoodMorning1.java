package com.ureca;

import java.util.Arrays;

//DFS
public class GoodMorning1 {

   static int[] num = {1, 2, 3, 4};
   static int R = 2;
   static int depth;
   static int[] arr;
   static boolean[] selected;
   
   public static void main(String[] args) {
	   
	  arr = new int[R];
	  selected = new boolean[num.length];
	   
      
//      1. num에서 R개를 뽑아서 만들 수 있는 순열을 모두 출력하시오.
      System.out.println("----- 순열 -----");
      makePermutation(0);      
      
      
//      2. num에서 R개를 뽑아서 만들 수 있는 조합을 모두 출력하시오.
      System.out.println("----- 조합 -----");
      makeCombination(0,0);
      
      
//      3. num으로 구성할 수 있는 모든 부분집합을 출력하시오.
      System.out.println("----- 부분집합 -----");
      makeSubset(0);
      
   }

	private static void makePermutation(int depth) {
	// TODO Auto-generated method stub
		if (depth==R) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i=0; i<num.length; i++) {
            if (!selected[i]) {
                selected[i] = true;
                arr[depth] = num[i];
                makePermutation(depth + 1);
                selected[i] = false;
            }
        }
	}//makePermutation

	private static void makeCombination(int index, int depth) {
	// TODO Auto-generated method stub
		if(depth==R) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int i=index; i<num.length; i++) {
			arr[depth] = num[i];
			makeCombination(i+1, depth+1);
		}
	}//makeCombination

	private static void makeSubset(int index) {
		// TODO Auto-generated method stub
		if(index==num.length) {
			for(int i=0; i<num.length; i++) {
				if(selected[i]) System.out.println(arr[i]+" ");
			}
			System.out.println();
			return;
		}//if문
		selected[index] = true;
		makeSubset(index+1);
		selected[index] = false;
		makeSubset(index+1);
	}//makeSubset
}