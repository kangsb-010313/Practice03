package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		int a = 0;
		
		for(int i=1; i<=num; i++) {
			a = a + i;
			
		}
		System.out.println("합계: " + a);
		
		sc.close();
		
		
	}
	
}
