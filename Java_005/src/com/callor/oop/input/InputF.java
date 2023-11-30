package com.callor.oop.input;

import java.util.Scanner;

public class InputF {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0;
		int index = 0;
		while (true) {
			System.out.println("정수 >> " + index);
			String str = scan.nextLine();
			if (str.equals("QUit")) {
			}
			try {
				num = Integer.valueOf(str);
				if (num % 2 == 0) {

				}
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해주세요");

			}
		}
	}
}
