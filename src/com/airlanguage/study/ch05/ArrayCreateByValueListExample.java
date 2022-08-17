package com.airlanguage.study.ch05;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {

		//선언하는 방법 두가지.. 차이는 없음
		int [] scroeEnglish;
		int scoreMath[];
		
		
		//정수 입력방법
		int[] scoreChemistry = {88,99,45,86,34};
		
		//문자열 입력방법
		String[] name = {"김기율","김기","율"};
		
		System.out.println("점수 : "+ scoreChemistry[4]);
		
		System.out.println("이름 : " + name[0]);
		int sum = 0;
		double avg = 0;
		//길이 짧아서 숫자로 썼는데, 배열.length로 써야한다..
		for(int i=0; i<scoreChemistry.length; ++i) {
			sum += scoreChemistry[i];
		}
		avg = (double)sum/5;
		System.out.println("점수 합은 : " + sum +" " + " 점수 평균 : " + avg);
		
	}
}
