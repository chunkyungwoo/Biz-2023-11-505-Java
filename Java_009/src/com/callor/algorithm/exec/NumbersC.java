package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersC {
	
	public static void main(String[] args) {
		NumberService numservice = new NumberService();
		Line.dLine(50);
		int num1 = numservice.inputNum("숫자를");
		Line.sLine(50);
		for(int i = 0; i < num1; i++) {
			for(int j = num1; j > i ; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
