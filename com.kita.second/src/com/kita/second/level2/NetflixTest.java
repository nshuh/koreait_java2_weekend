package com.kita.second.level2;

public class NetflixTest {
	public static void main(String[] args) {
		ProGamer hong = new ProGamer();
		Game gm = new Game();
		BettleGround bg = new BettleGround();
		Overwatch ow = new Overwatch();
				
		
		hong.work(gm);
		hong.work(bg);
		hong.work(ow);
		
		
		Viewer rv = new Viewer();
		rv.chooseNew();

	}

}
