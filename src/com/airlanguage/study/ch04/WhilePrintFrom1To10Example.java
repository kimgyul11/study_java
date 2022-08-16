package com.airlanguage.study.ch04;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int sum = 0;
		
		while(i <= 10) {
			sum += i;
			System.out.println(i + ":" + sum);
			i++;
			
		}
	}
}
