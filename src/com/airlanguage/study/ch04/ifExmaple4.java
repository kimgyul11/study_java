package com.airlanguage.study.ch04;

public class ifExmaple4 {

	public static void main(String[] args) {

		// int 타입 변수 선언
		// 짝수인지 홀수인지
		
		int a = 7;
		
		if(a != 0) {
			if(a%2 == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다,");
			}
		}else {
			// a==0인경우..
			System.out.println("숫자를 제대로 입력하세요..");
		}
	}
}
