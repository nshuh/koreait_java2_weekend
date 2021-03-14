package com.kita.second.level3.cafe;

public class Cafe {
	public static void main(String[] args) {
		Menu menu = new Menu(); // menu앞에 있는 Menu가 타입이고 변수임
		Customer cus = new Customer();
		Barista bar = new Barista();
		
		MenuItem chosenMenu = cus.order(menu);
		Coffee c1 = bar.makeCoffee(chosenMenu);
		cus.drinkCoffee(c1);
	}

}
