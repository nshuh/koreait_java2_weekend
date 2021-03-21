package com.kita.second.level3.cafe2;

public class Coffee {
	private String name;
	private int price;
	
	public Coffee(MenuItem mi) {
		name = mi.getName();
		price = mi.getPrice();
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}

}