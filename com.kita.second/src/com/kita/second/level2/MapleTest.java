package com.kita.second.level2;

public class MapleTest {
	public static void main(String[] args) {
		Adventurer adv = new Adventurer();
		Magician mg = new Magician();
		
		mg.mp = 10;
		
		adv.attack();
		adv.jump();
		
		mg.attack();
		mg.jump();
		mg.teleport();
	}

}
