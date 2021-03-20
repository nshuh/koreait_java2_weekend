package com.kita.second.level3.cafe;

import java.util.Scanner;

public class Customer {
	public MenuItem order(Menu m) {
		m.showMenus();

		Scanner scan = new Scanner(System.in);
		MenuItem mi = null;

		while(mi == null) {
			// 채우기 (배민객체지향 검색해서 참조...)
			// 메뉴판에 있는 것을 뽑아주는 코드를 작성
			System.out.print("메뉴 번호를 입력해주세요: ");
			String strNum = scan.next();
			int menuNum;
			try {
				menuNum = Integer.parseInt(strNum); //error날수 있으니  trychach로 묶어줘야 함
				mi = m.choose(menuNum-1); //인덱스 시작이 0임으로....??
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
		System.out.println(name+"(을)를 마신다.");

	}

}
