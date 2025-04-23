package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) { //곱하는 수

			for(int dan=2; dan<=9; dan++) { //단
				System.out.print(dan + "*" + i + "=" + dan*i + "\t");
				
			}//for2
			System.out.println();
		}//for2
	}

}
