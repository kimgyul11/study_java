package com.airlanguage.study.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {

		int [][] scores = {{99,88,55},{55,77,66},{55,55,44},{55,55,44},{55,55,77}};
		
		//5명, 국-영-수 점수
		//1.개인평균 2.과목별 평균 구하기
		
		
		System.out.println(scores[0][2]);
		System.out.println("----------------");
		//내가한거
//		for(int i=0; i<scores.length; ++i) {
//			int sum = 0;
//			//안쪽의 길이도 구할 수 있다..
//			for(int j=0; j<scores[i].length; ++j) {
//				sum+=scores[i][j];
//			}
//			System.out.println((double)sum/3);
//			
//		}
		
		
		
//		String[] name = {"한찬구","장동건","고소영","박태환","싸이"};
//		String[] subject = {"국어","영어","수학"};
		
		
		//1 개인의 평균
		/*
		for(int i=0; i<5; i++) {
			int sum=0;
			for(int j=0; j<3; j++) {
				sum +=scores[i][j];
			}
			System.out.println(name[i]+"의 평균 점수는: "+((double)sum/3));
		}
		System.out.println("------------------------------");
		*/
//		for(int i=0; i<scores.length; i++) {
//			int sum=0;
//			for(int j=0; j<scores[i].length; j++) {
//				sum +=scores[i][j];
//			}
//			System.out.println(name[i]+"의 평균 점수는: "+((double)sum/3));
////			System.out.println(name[i]+"의 평균 점수는: "+((double)sum/scores[i].length));
//		}
//		
//		System.out.println("------------------------------");
//		//2----과목별 평균
//		for(int j=0; j<3; j++) {
//			int sum=0;
//			for(int i=0; i<5; i++) {
//				sum +=scores[i][j];
//			}
//			System.out.println(" 과목의 평균 점수는: "+((double)sum/5));
//		}
		
	}

}
