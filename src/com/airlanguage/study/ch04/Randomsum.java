package com.airlanguage.study.ch04;

import java.util.Random;

public class Randomsum {

	public static void main(String[] args) {
		//모든 게시판 목록에는 for문 사용된다.
		//1~100사이의 랜덤 정수 2개를 발생시켜 두 수의 사이의 합을 구하자.
	
		
		//랜덤 숫자 내는법
		


		// 1 ~ 100 사이의 랜덤 정수 2개를 발생시켜
				// 두 수 사이의 합을 구하라
				
//				double num1 = 1.0;
//				double num2 = 100.0;
//				
//				int sum = 0, min = 0, max = 0;
//				
//				int random1 = (int) ((Math.random() * (num2 - num1)) + num1);
//				int random2 = (int) ((Math.random() * (num2 - num1)) + num1);
//				
//				if (random1 < random2) {
//					max = random2;
//					min = random1;
//				} else {
//					max = random1;
//					min = random2;
//				}
//				
//				System.out.println("min : " + min + ", " + "max : " + max);
//				
//				for (int i = min; i <= max; i++) {
//					sum += i;
//					System.out.println(i + " : " + sum);
//				}
//				
//				System.out.println("total : " + sum);

//				ctrl과 shift와 o를 눌러야지 호출할수있음 new 를..				
//				여기서 부터 정민님 소스
				Random rand = new Random();
				
				int num1 = rand.nextInt(100);
				int num2 = rand.nextInt(100);
				
				int sum = 0;
				
				if(num1 > num2) {
					for(int i = num2 ; i <= num1; i++) {
						sum += i;
						System.out.print(i + " + ");
						if(i == num1) System.out.print(i + " ");
					}
					System.out.print(" = " + sum);
				} else {
					for(int i = num1 ; i <= num2; i++) {
						sum += i;
						System.out.print(i + " + ");
						if(i == num2) System.out.print(i + " ");
					}
					System.out.print(" = " + sum);
					System.out.println(num1 + " ~ " + num2 + " 사이의 합은 " + sum);
				}
			
		
		
		
	}

}
