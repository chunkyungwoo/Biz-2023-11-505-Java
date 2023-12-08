package com.callor.score;

import com.callor.score.service.ScoreService;

public class ScoreA {
	
	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();
		scoreService.inputScore();
		scoreService.printScore();
		
	}

}
