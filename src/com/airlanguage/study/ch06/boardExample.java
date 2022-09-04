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

		board b0 = new board();
		board b1 = new board("김김김");
		board b2 = new board("김기률",24);
		board b3 = new board("김기홀",true);
		board b4 = new board("김기율율율",20040,false);
		
		b0.say();
		b1.say();
		b2.say();
		b3.say();
		b4.say();
		
	}	
}
