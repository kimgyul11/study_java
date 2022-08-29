package com.airlanguage.study.ch07.sixth;

public class AnimalExample {

	public static void main(String[] args) {

		String a="고양이";
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		dog.sound();
		cat.sound();
		cat.sound(a);
		System.out.println("------");
		
		
	}

}
