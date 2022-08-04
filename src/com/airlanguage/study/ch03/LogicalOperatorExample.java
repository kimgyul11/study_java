package com.airlanguage.study.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {

//		&& = &:and 논리연산자 둘다 참이여야 참
//		|| = |:or 둘중하나 참이면 참
//		^논리 :한개만 참이면 참
		
		int a =65;
		
		boolean result = (a >= 65);
		System.out.println("result:"+result);
		
		boolean result2 = (a <= 65);
		System.out.println("result2:"+result2);
		
		
		if(a >= 65 & a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		
		if(a >= 65 && a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		
			System.out.println("-----------------------------");
			
			if(a >= 65 | a <=90) {
				System.out.println("둘다참");
			}
			if(a >= 66 | a <=90) {
				System.out.println("한개만 참");
			}
			if(a >= 66 | a <=40) {
				System.out.println("둘다거짓 이라서 출력 안됩니다.");
			}
			
			System.out.println("---------------------------");
			//파이프 한개더
			if(a >= 65 || a <=90) {
				System.out.println("둘다참");
			}
			if(a >= 66 || a <=90) {
				System.out.println("한개만 참");
			}
			if(a >= 66 || a <=40) {
				System.out.println("둘다거짓 이라서 출력 안됩니다.");
			}
			if(a >= 65 || a <=70) {
				System.out.println("이렇게 둘다 참이여야 출력이됩니다");
			}
			System.out.println("---------------------------");
			
			
			//^
			
			if(a >= 65 ^ a <=50) {
				System.out.println("한개만 참");
			}
			if(a >= 65 ^ a <90) {
				System.out.println("둘다 참");
			}
			if(a >= 66 ^ a <=90) {
				System.out.println("한개만 참");
			}
			if(a >= 66 || a <=50) {
				System.out.println("둘다 거짓");
			}
		}
	}
}
