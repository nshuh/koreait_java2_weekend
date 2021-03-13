package com.kita.second.level2;

public class Drama extends Netflix {
	public Drama(int maxChapter) {
		super(maxChapter);
	}
	
	@Override
	boolean watch() {
		++chapter;
		if(chapter <= maxChapter) {
			System.out.println("드라마를 시청한다.");
			 return true;
		}
		System.out.println("드라마를 이미 다 시청했다.");
		return false;
	}
	
}
