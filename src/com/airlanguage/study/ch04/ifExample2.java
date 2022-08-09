package com.airlanguage.study.ch04;

public class ifExample2 {

	public static void main(String[] args) {
	
		int level =5;
		double buyValue = 10000;
		double sale1 = 0.05;
		double sale2 = 0.1;
		double sale3 = 0.15;
		double sale4 = 0.20;
		double sale5 = 0.027;
		
		if (level == 1) {
			System.out.println("정가 = "+"일반 등급 할인 가격 = " + (buyValue-sale1*buyValue));
		} else if(level == 2) {
			System.out.println("브론즈 등급 할인 가격 = " + (buyValue-sale2*buyValue) );	
		} else if(level == 3) {
			System.out.println("실버 등급 할인 가격 = " + (buyValue-sale3*buyValue));
		} else if(level == 4) {
			System.out.println("골드 등급 할인 가격 = "+(buyValue-sale4*buyValue));
		} else if(level == 5) {
			System.out.println("골드 등급 할인 가격 = "+(buyValue-sale5*buyValue));
		} else {
			System.out.println("할인이 적용되지 않았습니다.");
		}
		// 
		int grade = 2;
		int price =10000;
		double percent, sale;
		
		if(grade == 1) {
			percent = 0.05;
			sale = price - price*percent;
			System.out.println("정가 :"+price +"할인가 : "+(int)sale);
		}else if(grade == 2) {
			percent = 0.1;
			sale = price - price*percent;
			System.out.println("정가 :"+price + "할인가 : "+(int)sale);
			
		}
	}
}
