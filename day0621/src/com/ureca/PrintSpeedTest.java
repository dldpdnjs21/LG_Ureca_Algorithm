package com.ureca;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class PrintSpeedTest {
	public static void main(String[] args) {
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		bw.append('a');
//		bw.write("");

		//String고정문자열		StringBuilder가변문자열
		StringBuilder sb = new StringBuilder();
		
		long start = System.currentTimeMillis();
//		long start2 = System.nanoTime();
		
		for(int i=0; i<100000; i++) {
//			System.out.println("유레카");	
//			sb.append("유레카~");
			sb.append("\n");
		}//for문
		System.out.println(sb.toString());
		
		long end = System.currentTimeMillis();
//		long end2 = System.nanoTime();
		
		System.out.println("출력시간:"+(end-start));
//		System.out.println("출력시간:"+(end2-start2));
	}//main
}//end class
