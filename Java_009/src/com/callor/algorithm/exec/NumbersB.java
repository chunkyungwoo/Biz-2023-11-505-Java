package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersB {
	
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int num1 = numService.inputNum("숫자를 ");
		Line.sLine(50);
		for(int i = 0; i < num1; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
