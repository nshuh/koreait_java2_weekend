package com.kita.second.level2;

public class BettleGround extends Game {
	public BettleGround (String title) {
		super(title);
	}
	
	@Override
	void playGame() {
		System.out.println("배틀그라운드를 한다.");
	}

}
