package com.airlanguage.study.ch02;

public class CharExample {

	public static void main(String[] args) {

//자바는 모든 문자를 유니코드로 처리함
		
		
		char c1= 'A';		//문자를 저장
		char c2= 65;		//십진수로 저장
		char c3 = '\u0041';	//16진수로 저장

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4='가';
		char c5=44032;
		char c6='\uac00';
//		char c1= "";
//		char c1= "";
//		char c1= "";

	}

}
