package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		int a = 0;
		int b = 0;
		
		for(int i=1; i<=num; i++) {
			if(i % 5 == 0) {
				a++;
				b = b + i;
			}		
		}
		System.out.println("5의 배수의 개수: " + a);
		System.out.println("5의 배수의 합: " + b);
		
		
		sc.close();
		
		
		
	}
	
	
}
