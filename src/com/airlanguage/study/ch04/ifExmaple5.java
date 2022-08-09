package com.airlanguage.study.ch04;

import java.lang.reflect.Array;

public class ifExmaple5 {

	public static void main(String[] args) {

		// int 타입의 변수 2개선언
		// 두 정수가 주어졌을때 사분면 어디에 해당하는지 ..
		
		int x = -2;
		int y = 4;
		
		if(x>0 && y>0) {
			System.out.println("1사분면 입니다.");
		}else if(x<0 && y>0) {
			System.out.println("2사분면 입니다.");
		}else if(x<0 && y<0) {
			System.out.println("3사분면 입니다.");
		}else if(x>0 && y<0) {
			System.out.println("4사분면 입니다.");
		}else if(x==0 && y!=0) {
			System.out.println("x축 위에 있습니다.");
		}else if(x!=0 && y == 0) {
			System.out.println("y축 위에 있습니다.");
		}else {
			//a == 0 & b == 0
			System.out.println("원점에 위치합니다.");
		}
	
	}
}
