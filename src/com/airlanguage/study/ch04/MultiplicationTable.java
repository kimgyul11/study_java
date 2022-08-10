package com.airlanguage.study.ch04;

public class MultiplicationTable {

	public static void main(String[] args) {

		//구구단 2단입니다
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("2 *"+ i +" = " + (2*i));
		}
		
		// 2단 부터 9단 조건:6줄이상 안되게
		
		for(int i = 2; i <= 9 ; i++) {
			for(int j = 1; j <= 9 ; j++) {
				int sum=i*j;
				System.out.println(i+" * "+j+" = "+sum);
			}
		}
			
		
		
	}

}
