package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.utils.Line;

public class ScannerA {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 25;
		int num1 = 33;
		
		Line.dLine(50);
		System.out.println("첫번째 정수를 입력하세요 >> ");
		String str1 = scan.nextLine();
		num = Integer.valueOf(str1);
		System.out.println("두번째 정수를 입력하세요 >> ");
		String str2 = scan.nextLine();
		num1 = Integer.valueOf(str2);
		Line.sLine(50);
		System.out.printf("%d + %d = %d\n ", num ,num1 ,num + num1);
		System.out.printf("%d - %d = %d\n ", num ,num1 ,num - num1);
		System.out.printf("%d x %d = %d\n ", num ,num1 ,num * num1);
		System.out.printf("%d ÷ %d = %d\n ", num ,num1 ,num / num1);
		
		System.out.printf("%d MOD %d = %d\n",num, num1, num % num1);
		Line.dLine(50);
	}
	

}
