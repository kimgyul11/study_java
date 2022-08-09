package com.airlanguage.study.ch04;

public class ifExmaple3 {

	public static void main(String[] args) {

		//int타입 변수2개 선언
		//두 정수가 주어졌을때 두 정수 비교.
		//비교 결과 나타내는 프로그램
		
		int a = 3;
		int b = 3;
		
		if(a > b) {
			System.out.println("a의 값"+a +"는 "+"b의 값"+b+"보다 큽니다.");
		} else if(a < b) {
			System.out.println("b의 값"+b +"는 "+"a의 값"+a+"보다 큽니다.");
		} else {
			System.out.println("두 정수의 값은 같습니다.");
		}
	}
}
