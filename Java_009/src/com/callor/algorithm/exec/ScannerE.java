package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class ScannerE {
	
	public static void main(String[] args) {
		NumberService keyService = new NumberService();
		Line.dLine(50);
		int num1 = keyService.inputNum("원하는 구구단 단수를 입력해 주세요 >> ");
		
		Line.dLine(50);
		System.out.printf("%5d x %d = %d\n", num1 );
	}

}
