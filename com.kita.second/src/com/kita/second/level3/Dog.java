package com.kita.second.level3;

public class Dog extends Animal{
	public Dog(String name) {
		super(name); //Animal(name);
	}
	
	
	// Overriding
	@Override //오버라이드 할 때는 반드시 적어줘야함
	void cry() {
		System.out.println("개가 운다.");
	}

}
