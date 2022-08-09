package com.airlanguage.study.ch04;

public class SwitchExample2 {

	public static void main(String[] args) {

		int grade = 9;
		int cost = 10000;
		double salesCost=0.0;
		
		switch (grade) {
		case 1:
			salesCost = cost * (1-0.05);
			System.out.println("혜택가격은:"+(int)salesCost+"원 입니다.");
			break;
		
		case 2:
			salesCost = cost * (1-0.1);
			System.out.println("혜택가격은:"+(int)salesCost+"원 입니다.");
			break;
		
		case 3:
			salesCost = cost * (1-0.15);
			System.out.println("혜택가격은:"+(int)salesCost+"원 입니다.");
			break;
		case 4:
			salesCost = cost * (1-0.2);
			System.out.println("혜택가격은:"+(int)salesCost+"원 입니다.");
			break;
		case 5:
			salesCost = cost * (1-0.027);
			System.out.println("혜택가격은:"+(int)salesCost+"원 입니다.");
			break;
		default :
			System.out.println("등급외 회원입니다.");
			break;
		}
		
		
	}

}
