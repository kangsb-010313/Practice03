package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//while (true){
			
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			
//			if(num <= 7) {
				for(int i=1; i<=num; i++) { 
					for(int a=1; a<=i; a++) { 
						System.out.print(i);
					}
					System.out.println("");
				}

//				num++;
//			}
			
//			if(num > 7) {
//				break;
//			}
			
			
		//}//while
		
		sc.close();
	}

}
