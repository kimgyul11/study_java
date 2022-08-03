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
		// 쓰이는경우:평점   데이터베이스에서는 int로 선언되니
		
		sum(8,7,5);
		sum(1,9,5);
		sum(5,6,6);
		sum(4,7,1);
		sum(7,5,5);
		
		avg("홍길동",60,70,85,90,45);
		avg("박말순",50,75,70,60,70);
		avg("고장난",55,60,64,58,90);
		avg("도룡용",80,70,63,88,78);
		
	}
	//
	public static void sum(int a, int b , int c ) {
		
		System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c) );
	}
	
	public static void avg(String name, double eng, double math, double physics, double music,double athletic ) {

		System.out.println(name+"의 평균은"+(eng+math+physics+music+athletic)/5 );
	}
}
	

