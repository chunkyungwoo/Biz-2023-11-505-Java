package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersD {
	
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		int sum = 0;
		int count = 0;
		Line.dLine(50);
		while(sum < 1000) {
			int num1 = numService.inputNum("숫자를 ");
			
			if(sum > 1000) {
				break;
			}
		}
		Line.sLine(50);
		System.out.print("5 번 입력한 숫자 총 합 : ");
		Line.dLine(50);
	}

}
