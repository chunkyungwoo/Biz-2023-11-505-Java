package com.callor.oop.input;

import java.util.Scanner;

public class InputG {	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수(QUIT : 종료) >> ");
			String str = scan.nextLine();		
			if(str.equals("QUIT")) {
				break;
			}
			int num = 0;
			try {
				num = Integer.valueOf(str);
			}catch (Exception e) {
				System.out.println();
				System.out.println("입력한 값 : " + str);
				continue;
			}
			if(num > 2){
				System.out.println("값은 2이상의 정수를 입력해야합니다 ");
				System.out.println("입력한 값 : " + num);
				continue;
			}
			if(num % 2 == 0) {
				System.out.printf("%d 는 짝수임",num);
			}else {
				System.out.printf("%d 는 짝수가 아님\n", num);
			}
		}
	}

}
