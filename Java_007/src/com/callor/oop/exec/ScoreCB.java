package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;

public class ScoreCB {
	
	public static void main(String[] args) {
		ScoreService[] scores = new ScoreService[10];
		scores[0] = new ScoreService();
		
		for(int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreService();
		}
		
		for(int i = 0; i < scores.length; i++) {
			scores[i].scoreKor = (int)(Math.random()* 50)+ 51;
			scores[i].scoreEng = (int)(Math.random()* 50)+ 51;
			scores[i].scoreMath = (int)(Math.random()* 50)+ 51;
		}
		System.out.println(scores[1].scoreKor);
		System.out.println(scores[1].scoreEng);
		System.out.println(scores[1].scoreMath);
	}

}
