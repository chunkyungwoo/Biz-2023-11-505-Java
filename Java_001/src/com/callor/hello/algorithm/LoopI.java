package com.callor.hello.algorithm;

public class LoopI {
	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {
			int num = i + 1;
			if(num % 7 == 0) {
				// 1~100까지 숫자 중에서 7의 배수만
				// : 조건을 주고 조건을 만족하는 것만 출력
				System.out.printf("%d " , num);
			}
		}
	}

}
