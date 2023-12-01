package com.callor.oop.keyboard;

import java.util.Scanner;

public class keyBoardCA {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while(true) {
		int rndNum = (int)(Math.random()* 50)+ 1;
		int count = 0;
		
		System.out.println("=".repeat(50));
		System.out.println("숫자 맞추기 게임");
		System.out.println("=".repeat(50));
		
		while(true) {
			System.out.println("1 부터 50까지 범위의 정수를 입력하세요");
			System.out.println("정수 >> ");
			String str = scan.nextLine();
			
			int num = 0;
			try {
				num = Integer.valueOf(str);
			}catch(Exception e){
				System.out.println("정확한 정수값을 입력하세요. ");
				System.out.printf("입력한 값 : (%s)\n", str);
				count++;
				continue;				
			}
			if(num < 1 || num > 50) {
				System.out.println("1 ~ 50 까지의 정수만 입력하세요");
				count++;
				continue;
			}
			if(num == rndNum) {
				System.out.println("참 잘했어요"+ num);
				System.out.printf("%d 번의 입력만에 찾았습니다\n",count);
				count++;
				continue;//break;
			}else if(num > rndNum) {
				System.out.println("입력한 값이 너무 커요. ");
				count++;
			}else if(num < rndNum) {
				System.out.println("입력한 값이 너무 작아요. ");
				count++;
			}
			if(count == 5) {
				System.out.printf("황금열쇠 찾기에 실패하였습니다 정답은%d입니다\n", rndNum);
				break;
			}
			
			System.out.println("다시 한번 잘 생각해보세요. ");
		}while(true) {
			System.out.print("X 또는 O ");
			String str = scan.nextLine();
			if(str.equals("O")) {
				break;
				
			}if(str.equals("X")) {
				System.out.println("종료합니다. ");
				return;
			}
		}
		
		continue;
		
	}
	}
}
