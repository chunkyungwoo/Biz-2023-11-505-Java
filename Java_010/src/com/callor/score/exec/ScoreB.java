package com.callor.score.exec;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

public class ScoreB {
	
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		ScoreDto scoreDto = new ScoreDto();		
		
		int num1 = numService.inputNumber("국어 점수를 ");
		System.out.println(num1);
		scoreDto.kor = num1;
		int num2 = numService.inputNumber("수학 점수를 ");
		System.out.println(num2);
		scoreDto.math = num2;
		int num3 = numService.inputNumber("영어 점수를 ");
		System.out.println(num3);
		scoreDto.eng = num3;
		System.out.printf("세 과목의 총점은 : %d ",scoreDto.getTotal() );
	}

}
