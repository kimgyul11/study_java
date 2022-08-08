package com.airlanguage.study.ch04;

public class ifExample {

	public static void main(String[] args) {
		int score = 98;
		
		if(score >= 90) {
			if(score >= 97) {
				System.out.println("A+");
			}
			else if(score <= 92) {
				System.out.println("A-");
			}
			else {
				System.out.println("A");
			}
		}
		
		else if (score >=88 &  score<90) {
			System.out.println("A");
		} else if(score >=80){
			System.out.println("B");
		} else if(score >=70){
			System.out.println("c");
		} else if(score >=60){
			System.out.println("D");
		} else{
			System.out.println("재수강");
		}
		
		
		
	}
}
