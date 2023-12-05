package com.callor.score.exec;

import com.callor.score.service.ScoreServiceB;

public class ScoreC {
	
	public static void main(String[] args) {
		
		// java 에서 배열은 변경이 불가능하다
		// 때문에 배열대신 java 에서 쓰는것
		
		String data1 = "src/com/callor/score/service/data.txt";
		String data2 = "src/com/callor/score/service/data2.txt";
		String data3 = "src/com/callor/score/service/data3.txt";
		
		ScoreServiceB sService1 = new ScoreServiceB(data1);
		sService1.loadScores();
		sService1.countScore();
		
		ScoreServiceB sService2 = new ScoreServiceB(data2);
		sService2.loadScores();
		// sService2.scores = null;
		sService2.countScore();
		// sService2.printScore();
		
		ScoreServiceB sService3 = new ScoreServiceB(data3);
		sService3.loadScores();
		sService3.countScore();
	}

}
