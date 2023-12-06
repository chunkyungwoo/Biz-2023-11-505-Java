package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersG {

	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int score = numService.inputNum("점수를 ");
		Line.sLine(50);
		if (score >= 95) {
			System.out.println("A+ 입니다 ");
			System.out.println("축하합니다");
		} else if (score >= 90 && score < 94) {
			System.out.println("A 입니다");
			System.out.println("축하합니다");
		} else if (score >= 85 && score < 89) {
			System.out.println("B+ 입니다");
			System.out.println("축하합니다");
		} else if (score >= 80 && score < 84) {
			System.out.println("B 입니다");
			System.out.println("축하합니다");
		} else if (score >= 75 && score < 79) {
			System.out.println("C+ 입니다");
			System.out.println("더 분발하세요");
		} else if (score >= 70 && score < 74) {
			System.out.println("C 입니다");
			System.out.println("더 분발하세요");
		} else if (score >= 65 && score < 69) {
			System.out.println("D+ 입니다");
			System.out.println("더 분발하세요");
		} else if (score >= 60 && score < 64) {
			System.out.println("D 입니다");
			System.out.println("더 분발하세요");
		} else if (score >= 0 && score < 59) {
			System.out.println("F 입니다");
			System.out.println("낙제입니다");
		}
		Line.sLine(50);

	}

}
