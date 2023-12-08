package com.callor.hello.arrays;

public class ArraysCA {
	// 배열 5개 선언하기(선언하기)
	// 배열에 랜덤 값 저장하기
	//배열에 저장된 값 출력하여 확인하기
	public static void main(String[] args) {
		int[] num = new int[5];
		
		for(int index = 0; index < 5; index++) {
			num[index] = (int)(Math.random()*50)+51;
		}
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d 번째 저장된 값 : %d\n",i +1 ,num[1]);
		}
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += num[i];
			System.out.printf("합계 :"+sum);
		}
	}
}
