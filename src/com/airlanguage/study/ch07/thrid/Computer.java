package com.airlanguage.study.ch07.thrid;

public class Computer extends Calculator {



	
	//첫번째 방법
	//부모의 메소드함수 이름 그대로 자식클래스에 써주면 오버라이드 .. 
	
//	public double areaCircle(double r) {
//		System.out.println("Calculator 객체의 areaCircle 실행");
//		return 3.14159 * r * r;
//	}
	
	
	//두번째 방법
	//오른쪽 마우스클릭 > source >override/Implement 
	
	@Override
	public double areaCircle(double r) {
		System.out.println("computer 객체의 areaCircle 실행");
		return Math.PI *r*r;
		
	}
}
