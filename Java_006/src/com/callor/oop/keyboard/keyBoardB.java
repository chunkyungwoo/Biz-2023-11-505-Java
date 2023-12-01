package com.callor.oop.keyboard;

import java.util.Scanner;

public class keyBoardB {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int rndNum = (int)(Math.random()* 10)+ 1;
				
		while(true){						
			System.out.println("정수 >>");
			String str = scan.nextLine();
		
		try {
			num = Integer.valueOf(str);
		}catch(Exception e) {
			System.out.println("정수를 정확히 입력해주세요. ");
			continue;
		}if(num > 10) {
			System.out.println("1부터 10까지 값을 입력하세요. ");
			System.out.println("프로젝트를 다시 실행해주세요. ");
			continue;
		}
		if(num == rndNum) {
			System.out.println("정답입니다.\n ");
			break;
		}
		else if(rndNum < num) {
			System.out.printf("%d 보다 값이 작습니다.\n ",num);
			continue;
		}
		else if(rndNum > num) {
			System.out.printf("%d 보다 값이 큽니다.\n ", num);
			continue;
		}
	}

}
}
