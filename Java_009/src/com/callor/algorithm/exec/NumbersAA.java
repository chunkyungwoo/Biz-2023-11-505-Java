package com.callor.algorithm.exec;

import com.callor.algorithm.utils.Line;

public class NumbersAA {
	
	public static void main(String[] args) {
// 모두 다른 방법이지만 결과는 같다		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d\t", i + 1);
		}
		System.out.println();
		Line.dLine(50);
		int index = 0;
		while(index < 10) {
			System.out.printf("%d\t",index + 1);
			index++;
		}
		System.out.println();
		Line.dLine(50);		
		index  = 0;
		while(true) {
			System.out.printf("%d\t",index + 1);
			index++;
			if(index >= 10) {
				break;
			}
		}
		System.out.println();
		Line.dLine(50);
		index = 0;
		while(index < 10) {
			System.out.printf("%d\t", index++ + 1);
		}
	}

}
