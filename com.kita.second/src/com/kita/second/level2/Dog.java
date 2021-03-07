package com.kita.second.level2;

public class Dog extends Animal{ //상속자
	boolean cutiness;
	public Dog(String name) {
		super(name); //Animal(name);
		this.cutiness = true;
//		super.method; Animal클래스에서 private로 걸려있기 때문에 x
	}
	
	
	// Overriding
	@Override //오버라이드 할 때는 반드시 적어줘야함
	void cry() {
		System.out.println("개가 운다.");
	}
		
	void bark() {
		System.out.println("개가 짖는다.");
	}
	
	
}
