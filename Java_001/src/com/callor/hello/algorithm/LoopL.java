package com.callor.hello.algorithm;

public class LoopL {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0 ; i < 100; i++) {
			if((i+1) % 2 == 0) {
				sum += i+1;
				
			}
			
			
		}
		System.out.print("1 ~ 100까지 숫자 중 짝수만 덧셈을 계산한 수 : ");
		System.out.println(sum);
	}
	

}
