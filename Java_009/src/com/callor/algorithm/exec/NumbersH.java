package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;

public class NumbersH {
	
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		
		int score1 = numService.inputNum("첫번째 점수 ");
		int score2 = numService.inputNum("두번째 점수 ");
		int score3 = numService.inputNum("세번째 점수 ");
		int total = score1 + score2 + score3;
		int avg = total / 3;
		
		if(avg >= 60) {
			System.out.println("축하합니다\n합격입니다");
			
		}else {
			System.out.println("아쉽지만\n낙제입니다");
		}
	}

}
