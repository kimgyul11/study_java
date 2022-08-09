package com.airlanguage.study.ch04;

public class SwitchExample {

	public static void main(String[] args) {

		int num = 95;
		
		switch(num){
			case 1:
				System.out.println("열지마라");
				break;
			case 2:
				System.out.println("95번입니다.");
				break;
				
			default:
				System.out.println("범위 밖입니다.");
				break;
		}
		
		String position = "사원";
		//if 로 사용하는경우가 더 많다.
		switch(position) {
		case "사원" :
			System.out.println("환영합니다 사원님");
			break;
		case "넘버" :
			System.out.println("환영합니다 넘버님");
		}
		
	}

}
