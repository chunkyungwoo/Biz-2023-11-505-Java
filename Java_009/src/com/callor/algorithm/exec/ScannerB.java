package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.utils.Line;

public class ScannerB {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		Line.dLine(80);
		while(true){
			System.out.println("첫번째 정수를 입력하세요 >> ");
			String str1 = scan.nextLine();
			try {
				num1 = Integer.valueOf(str1);
				
			} catch (Exception e) {
				
			}
		}
		
	}

}
