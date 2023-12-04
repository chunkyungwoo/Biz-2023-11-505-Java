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
		System.out.println("=".repeat(50));
		System.out.println("국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("-".repeat(50));
		for(int i = 0; i <scores.length; i++) {
			System.out.print(scores[i].scoreEng + "\t");
			System.out.print(scores[i].scoreKor+ "\t");
			System.out.print(scores[i].scoreMath+ "\t");
			System.out.print(scores[i].getScoreTotal()+ "\t");
			System.out.printf("%4.2f\n",scores[i].getScoreAvg());
		}
		System.out.println("=".repeat(50));
		
		
	}

}
