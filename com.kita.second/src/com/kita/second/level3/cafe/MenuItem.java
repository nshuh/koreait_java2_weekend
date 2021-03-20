package com.kita.second.level3.cafe;

public class MenuItem {
	private String name;
	private int price;
	
	public MenuItem(String name, int price) {
//		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	
	@Override
	public String toString() {
		return String.format("%s\t\t%,d원", name, price); // t:tap, t%,:천단위 쉼표구분 
	} // String.format : 문자열 안에 있는 format이라는 메소드, f와 유사하지만 Format은 별도 형태를 만들어서 리턴해줘서 출려

}
