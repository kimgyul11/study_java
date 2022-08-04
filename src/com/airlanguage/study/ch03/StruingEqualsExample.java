package com.airlanguage.study.ch03;

public class StruingEqualsExample {

	public static void main(String[] args) {
		
		String str1 = "김기율";
		String str2	= "김기율";
		String str3 = new String("김기율");
		
		boolean result1 = (str1 == str2);
		System.out.println("result1="+result1);
		
		boolean result2 = (str1 == str3);
		System.out.println("result1="+result2);
		
		System.out.println("str1.equals(str2):"+ str1.equals(str2));
		System.out.println("str1.equals(str3):"+ str1.equals(str3));
		
		//문자열 비교할때는 .equals를 사용한다.
		//같은값일때 비교연산자를 사용 할 수 없으니까 함수를 사용한다

	
	}
}
