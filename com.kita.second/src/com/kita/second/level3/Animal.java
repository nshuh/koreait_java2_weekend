package com.kita.second.level3;

public abstract class Animal { //abstract : 추상적인... (추상클래스) 공통된 것을 뽑아내서 중복을 피하기 위함
	String name;
	int age;

	public Animal(String name) {
//		super();
		this.name = name;
	}
	
	void breathe() {
		System.out.println("숨을 쉰다.");
	}
	
	abstract void cry();
	

}
