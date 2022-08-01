package com.airlanguage.study.ch02;

public class CastingExample {

	public static void main(String[] args) {
		
		
		//큰 타입에서 작은타입으로 변환은 문제가 생기거나 변환이 이루어져도 데이타 손실이 발생한다.
		//하지만 casting 을 사용해서 강제로 변환 가능합니다..
		//강제 형 변환 : casting : (원하는 형)변수명
		
		double doubleValue = 1234567;
		System.out.println("doubleValue:"+ doubleValue);
		
		double doubleValue2 = 1234567891;
		System.out.println("doubleValue2"+ doubleValue2);
		
		//사이즈순서 byte < short < int < long < float < double		
		
		//float 안에 double넣기
		float floatValue = (float) doubleValue;
		System.out.println("floatValue:"+floatValue);
		
		//long을 int안에
		long longValue = (long) floatValue;
		System.out.println("longValue:"+longValue);
		
		//int <- long
		int intValue = (int) longValue;
		System.out.println("intValue:"+intValue);
		
		short shortValue = (short) intValue;
		System.out.println("shortValue:"+shortValue);
		
		byte byteValue = (byte) shortValue;
		System.out.println("byteValue:"+byteValue);
		
		
		// int 를 string로 변환
		String stringValue = String.valueOf(intValue);
		System.out.println("stringValue :" + stringValue);
		
		// string 을 int 로 변환
		int intValue2 = Integer.parseInt(stringValue);
		System.out.println("intValue :" + intValue2);
		
		
		
		
	
	}
}
