package com.airlanguage.study.ch03;

public class DenyLongicOperatorExample {

	public static void main(String[] args) {
		
		
		boolean play = true;
		
		play = ! play;
		System.out.println("play :" + play);
		
		play = !play;
		System.out.println("play :" +play);
		
		int j = 3;
		
		if(!(j==3)) {
			System.out.println("3이 아님");
		}else {
			System.out.println("3임");
		}
		
		
	}
}
