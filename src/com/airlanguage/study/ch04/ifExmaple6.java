package com.airlanguage.study.ch04;

import java.lang.reflect.Array;

public class ifExmaple6 {

	public static void main(String[] args) {

		// int 타입의 변수 3개를 선언
		// 세개의 정수 중 최대값 최소값 구하는 프로그램작성
		
		int a = 7;
		int b = 7;
		int c = 9;
		
		if(a != b && b != c && c != a) { //서로 다른숫자여야 한다는 뜻입니다..
			if(a > b && a >c) {
				System.out.println("최대값은 a:"+a);
			}else if(b> a&& b>c) {
				System.out.println("최대값은 b:"+b);
			}else {
				System.out.println("최대값은 c:"+c);
			}
	
			if(a < b&& a< c) {
				System.out.println("최소값은 a:"+a);
			}else if(b < a && b < c){
				System.out.println("최소값은 b:"+b);
			}else {
				System.out.println("최소값은 c :"+c);
			}
		}else {
			System.out.println("동일한값이 존재합니다..수정해주세요..");
		}
		
		if(a > b && a > c) {
			System.out.println("최대값은 a입니다.");
		}else if(b > c && b >a ) {
			System.out.println("최대값은 b입니다.");
		}else if(c > a && c >b) {
			System.out.println("최대값은 c입니다.");
		}else {
			System.out.println("최대값에 동일한 값이 존재합니다.수정해주세요.");
		}

		
		if(a < b && a < c) {
			System.out.println("최소값은 a입니다.");
		}else if(b < c && b <a ) {
			System.out.println("최소값은 b입니다.");
		}else if(c < a && c <b) {
			System.out.println("최소값은 c입니다.");
		}else {
			System.out.println("최소값에 동일한 값이 존재합니다.수정해주세요. ");
		}
		
		
	}
}