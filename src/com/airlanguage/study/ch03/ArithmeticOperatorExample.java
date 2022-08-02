package com.airlanguage.study.ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		int result2 = v1 - v2;
		int result3 = v1* v2;
		int result4 = v1/v2;		
		int result5 = v1 % v2;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		//v1,v2는 int형이기때문에 2.0 으로만 나온다.
		double result6 = v1/v2;
		System.out.println("result6 = " + result6);
		
		// 강제형변환을 해주어야한다.
		double result7 = (double) v1/v2;
		System.out.println("result7 = " + result7);
		// 쓰이는경우:평점   데이터베이스에서는 int로 선언되니까..
	}

}
