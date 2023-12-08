package com.callor.score.exec.scores;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;
import com.callor.score.utils.Line;

public class ScoreC {
	
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		ScoreDto scoreDto = new ScoreDto();		
		int start = 50;
		int end = 100;
		Line.dLine(50);
		System.out.println("성적 리스트");
		Line.dLine(50);
		System.out.println("국어\t영어\t수학\t총점\n");
		Line.sLine(50);
		int scoreKor = numService.inputNumber("국어 점수",start,end);
	    int scoreEng = numService.inputNumber("영어 점수",start,end);
	    int scoreMath = numService.inputNumber("수학 점수",start,end);
		scoreDto.kor = scoreKor;
		scoreDto.eng = scoreEng;
		scoreDto.math = scoreMath;
		
		System.out.printf("총점"+scoreDto.getTotal());
		for(int i = 0; i < 3; i++) {
			
		}
		
	}

}
