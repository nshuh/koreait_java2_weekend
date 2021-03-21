package com.kita.second.level3.cafe2;

import java.util.Scanner;

public class Customer {
	public MenuItem order(Menu m) {
		m.showMenus();
		
		Scanner scan = new Scanner(System.in);
		MenuItem mi = null;
		
		while(mi == null) {
			System.out.print("메뉴 번호를 입력해주세요.");
			String strNum = scan.next();
			int menuNum;
			try {
				menuNum = Integer.parseInt(strNum);
				mi = m.choose(menuNum-1);
			} catch(NumberFormatException e) {
				System.out.println("숫자만 입력해주세요.");
			} catch(Exception e) {
				System.out.println("메뉴를 잘못 선택했습니다.");
			}
		}
		scan.close();
		return mi;
		
	}
	
	void drinkCoffee(Coffee coffee) {
		String name = coffee.getName();
		System.out.println(name + "(을)를 마신다.");
	}

}
