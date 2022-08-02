package com.airlanguage.study.ch02;

public class OperationsPromotionExample {

	public static void main(String[] args) {

//		byte 변수 byteValue 선언하고  12로 초기화
//		byte 변수 byteValue2 선언하고  12로 초기화		
//		byte 변수 byteValue3 선언하고  위의 두 변수를 합 연산 수행		
//		byteValue3 결과 출력		

		byte byteValue = 12;
		byte byteValue2 = 12;
		//byte byteValue3 = byteValue + byteValue2;오류나니까 int로 바꿔줘야한다.
		int intValue12 = byteValue + byteValue2;
		System.out.println(intValue12);
		
		short shortValue = 12;
		short shortValue2 = 12;
		//short shortValue3 = shortValue+shortValue2;
		int intValue2 = shortValue+shortValue2;
		System.out.println(intValue2);
		
		int intValue3 = 12;
		int intValue9 = 12;
		//int intValue3 = intValue+intValue2;
		int intValue6 = intValue3+intValue9;
		System.out.println(intValue6);
		
		long longValue = 12;
		long longValue2 = 12;
		long longValue3 = longValue+longValue2;
		System.out.println(longValue3);
		
		float floatValue = 12;
		float floatValue2 = 12;
		float floatValue3 = floatValue+floatValue2;
		System.out.println(floatValue3);
		
		double doubleValue = 12;
		double doubleValue2 = 12;
		double doubleValue3 = doubleValue+doubleValue2;
		System.out.println(doubleValue3);
		
		//byte byteValue4 = byteValue + intValue;	바이트에서
		int intValue4 = byteValue + intValue3;
		System.out.println(intValue4);
	
		//int intValue5 = intValue + doubleValue;
		double doubleValue4 = intValue3 + doubleValue;
		System.out.println(doubleValue4);
		


		
	}
}
