package com.airlanguage.study.ch03;

public class ConditionalOperationExample {

	public static void main(String[] args) {

		int score = 85 ;
		
		char grade = score > 90 ? 'A' : 'B' ;
		
		System.out.println("grade :" + grade);
		
		System.out.println("-----------------------");
		
		// 아래줄을 한줄로만든게 9번라인입니다..
		//빈번히 쓰이고 이것만 써야하는 상황이있음
		if(grade > 90) {
			System.out.println("grade:A");
		}else {
			System.out.println("grade: B");
		}
	}

}
