package com.callor.score.exec.scores;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;
import com.callor.score.utils.Line;

public class ScoreD {
	
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		List<ScoreDto> scores = new ArrayList<ScoreDto>();
		
		int start = 50;
		int end = 100;
		
		for(int index = 0; index < 3; index++) {
			int stdNum = index + 1;
			String stNum = String.format("S%04d", index+1);
			int scoreKor = numService.inputNumber(stdNum + "번의 국어 점수",start,end);
			int scoreEng = numService.inputNumber(stdNum + "번의 영어 점수",start,end);
			int scoreMath = numService.inputNumber(stdNum + "번의 수학 점수",start,end);
					
			ScoreDto scoreDto = new ScoreDto();
			scoreDto.kor = scoreKor;
			scoreDto.eng = scoreEng;
			scoreDto.math = scoreMath;
			scores.add(scoreDto);
		}
		Line.dLine(50);
		System.out.println("성적 리스트");
		Line.dLine(50);
		System.out.println("학번\t국어\t영어\t수학\t총점");
		
			
		
	}

}
