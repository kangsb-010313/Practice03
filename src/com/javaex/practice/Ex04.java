package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		 i
		 i
		 i
		 i
		 ==========
		 10
		 8
		 6
		 4
		 2
		 
		 
		 */
		
		for(int i=1; i<5; i++) {
			System.out.println("i");
		}
		System.out.println("=============");
		
		for(int i=10; i>0; i=i-2) { //i=i-2 설정!!!
			System.out.println(i);  // i=i-2로 설정했기 때문에 문자 "i" 출력이 아닌 i-2 값으로 출력
		}
		
		
	}

}
