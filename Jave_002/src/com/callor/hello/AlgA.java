package com.callor.hello;

public class AlgA {
	public static void main(String[] args) {
		
		/*
		 *  1~100까지 숫자중의 3의 배수의 합
		 */
		int sum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int num = i+1;
			if(num % 3 ==0 ) {
				// num의 값이 3의 배수인 경우만
				// 실행되는 코드
				sum += num;
				
				
			}
			
		}
		System.out.print("1 ~ 100까지 숫자 중 3의배수와 5의배수의 합 = ");
		System.out.println(sum);
		
	}

}
