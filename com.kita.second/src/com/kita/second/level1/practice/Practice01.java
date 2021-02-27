package com.kita.second.level1.practice;

public class Practice01 {
	// 구구단 2단 찍기 메소드를 만들어 보자
	// 2 * 1 = 2
	// 2 * 2 = 4
	// ...
	// 2 * 9 = 18
	public static void main(String[] args) {
		printGugudan();
		System.out.println();
		printGugudan2(9);
	}
	
	public static void printGugudan() {
		for(int i=1; i<10; i++) {
			System.out.printf("2*%d=%2d\n",i,2*i);
		}
	}
	
	public static void printGugudan2(int dan) {
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %2d\n",dan,i,dan*i);
		}
	}
	
}
