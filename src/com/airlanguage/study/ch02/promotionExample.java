package com.airlanguage.study.ch02;

public class promotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//작은 타입에서 큰 타입 변환은 문제가 발생하지 않는다.
		//큰 타입에서 작은타입으로 변환은 문제가 생기거나 변환이 이루어져도 데이타 손실이 발생한다.
		//byte < short <int <long <float < double
		
		byte byteValue = 10;
		System.out.println("byteValue:"+ byteValue +"일겁니다.");
		
		short shortValue = byteValue;
		System.out.println("short:"+ shortValue +"일겁니다.");
		
		int intValue = shortValue;
		System.out.println("intValue:"+ intValue +"일겁니다.");
		
		long longValue = intValue;
		System.out.println("longValue:"+ longValue +"일겁니다.");
		
		float floatValue = longValue;
		System.out.println("longValue:"+ floatValue +"일겁니다.");
		
		double doubleValue = floatValue;
		System.out.println("longValue:"+ doubleValue +"일겁니다.");
//		-------------------
		
		
		double doubleValue2 = 1234567;
		System.out.println();
		
		//int intValue2 = 1234567890;
		//System.out.println("intValue: "+ intValue);
		
		//값이 큰거에서 작은거는 오류
		
		//byte byteValue2 = intValue2;
		//System.out.println("byteValue2:" byteValue2 + "입니다~");
		
		//int intValue3 = 200;
		//System.out.println("intvalue3:" + intValue3 + "입니다.");
		
		//double doubleValue = intValue3;
		//System.out.println("doubleValue:" + doubleValue + "입니다.!");
	}
}
