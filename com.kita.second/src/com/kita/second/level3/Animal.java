package com.kita.second.level3;

public abstract class Animal { //abstract : 추상적인....
	String name;
	int age;

	public Animal(String name) {
//		super();
		this.name = name;
	}
	
	void cry(){
		System.out.println("동물이 운다.");
	}
	

}
