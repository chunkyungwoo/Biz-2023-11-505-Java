package com.callor.algorithm.exec;

import com.callor.algorithm.utils.Line;

public class NumbersA {
	
	public static void main(String[] args) { 
		int i = 1;
		Line.dLine(80);
		while(i < 11) {
			System.out.printf("%d\t", i++);										
		}
		System.out.println();
		Line.dLine(80);	
	}

}
