package com.airlanguage.study.ch05;
import java.util.*;

public class lottosample {

	public static void main(String[] args) {

		Random rand = new Random();
		int lottoNumber[] = new int[6];
		
		for(int i=0;i<lottoNumber.length;i++) {
			lottoNumber[i] = rand.nextInt(45)+1;
		}
		
	}

}
