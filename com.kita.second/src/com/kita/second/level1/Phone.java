package com.kita.second.level1;

public class Phone {
	//필드(속성)
	private String phoneName;
	private String owner;
	private String color;
	private int memory;
	private String phoneNumber; // phoneNumber 숫자를  String으로 지정한 이유 - 010.... 0으로 시작하기 때문에... 
	
	//생성자
	//생성자가 정의되지 않았을 때만 컴파일러가 기본 생성자 넣어줌
	public Phone() {}
	
	public Phone(String phoneName, String color, int memory) {
//	public Phone(String name, String color, int memory) {	
//      phoneName = name; 으로 해도됨
		this.phoneName = phoneName;
		this.color = color;
		this.memory = memory;
		//this : phone class에 있는 phone을 가르켜줌
	}
	
	// Phone의 모든 필드에 초기값을 넣어주는 생성자 만들기
	public Phone(String phoneName, String owner, String color, int memory, String phoneNumber) {
		this.phoneName = phoneName;
		this.owner = owner;
		this.color = color;
		this.memory = memory;
		this.phoneNumber = phoneNumber;		
	}
	
		
	//메소드(동작)
	//call(타입 person)
	//person에게 전화를 건다.
	void call(String person) {
		System.out.println(person + "에게 전화를 건다.");
	}
	
	//massage(String person){}
	//person에게 owner가 문자를 보낸다.
	void massage(String person) {
		System.out.printf("%s에게%s가 문자를 보낸다.",person, owner);
	}
	
	// 리턴타입 or void 메소드명(매개변수) {} --> 메소드의 기본형태
	
	// private관련 setter, getter 메소드 만들기
	void setOwer(String ower) {
		this.owner = owner;
	}
	String getOwner() {
		return owner;
	}
	
	void setColor(String color) {
		this.color = color; //필드에 값을 넣어준다 set
	}
	String getColor() {
		return color; //보내줘야 하기때문에  return 함 get
	}
	
	void setMemory(int memory) {
		this.memory = memory;
	}
	int getMemory() {
		return memory;
	}
	
	
}



//class Computer{
//	
//}
// class가 한파일에 2개 생성가능하지만 그냥 한파일에 1개의  class만 운영하는 것이 효율적이다. (유지/부수)

