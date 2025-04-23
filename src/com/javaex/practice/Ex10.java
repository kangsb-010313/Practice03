package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		System.out.println("숫자를 입력하세요");
		
		for(int i=1; i<=5; i++) { //초기값1, 5번 반복, 반복 할 때마다 +1
	
			System.out.print("숫자: ");
			int num1 = sc.nextInt();
			
			if(i == 1) { //i(1)이 1과 같을 때
				max = num1; // max == 입력한 수
			}else if(num1 > max) { //입력한 수 > max(이전 입력한 수) 보다 클 때 
				max = num1; // 입력한 수가 max(최대값)이 됨
			}
			
		}
		
		System.out.println("최대값은" + max + "입니다.");
		
		sc.close();
		
		
		
		
	}
	
	
}
