package com.airlanguage.study.ch12.first;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		
		//Toolkit소리를 내기위한 객체
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}

		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
