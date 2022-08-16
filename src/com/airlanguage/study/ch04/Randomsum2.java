package com.airlanguage.study.ch04;

import java.util.Random;

public class Randomsum2 {

	public static void main(String[] args) {
		//모든 게시판 목록에는 for문 사용된다.
		//1~100사이의 랜덤 정수 2개를 발생시켜 두 수의 사이의 합을 구하자.
	
		
		//랜덤 숫자 내는법
		


		// 1 ~ 100 사이의 랜덤 정수 2개를 발생시켜
		double num1 = 1.0;
		double num2 = 100.0;
		
		int sum = 0, min = 0, max = 0;
		
		int random1 = (int) ((Math.random() * (num2 - num1)) + num1);
		int random2 = (int) ((Math.random() * (num2 - num1)) + num1);
		
		if (random1 < random2) {
			max = random2;
			min = random1;
		} else {
			max = random1;
			min = random2;
		}
		System.out.println("max값은"+max + "이고, min값은" + min +"입니다.");
		for(int i=min; i<=max; ++i) {
			sum += i;
			System.out.println(i + ":" + sum );
		}
		System.out.println("전체합계 : "+ sum);
	}
}
