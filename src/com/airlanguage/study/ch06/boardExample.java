package com.airlanguage.study.ch06;

public class boardExample {

	public static void main(String[] args) {
		
		
//			Board2 board0 = new Board2();
//			Board2 board1 = new Board2("김태희1");
//			Board2 board2 = new Board2("김태희2", 5);
//			Board2 board3 = new Board2("김태희3", false);
//			Board2 board4 = new Board2("김태희4", 10, false);
//
//			board0.say();
//			board1.say();
//			board2.say();
//			board3.say();
//			board4.say();
		
		board b = new board();
		board b1 = new board("김김김");
		board b2 = new board("김기률","24회");
		board b3 = new board("김기홀",true);
		board b4 = new board("김기율율율","20040회",false);
		
		System.out.println(b.name);
		System.out.println("b1 : " + b1.name);
		System.out.println("이름 : " + b2.name+" 조회수 :"+b2.view);
		System.out.println("이름 : " + b3.name+" 조회수 :"+b3.ny);
		System.out.println("이름 : " + b4.name+" 조회수 :"+b4.view+" 사용법 : "+b4.ny);

	}

	
	
	
}
