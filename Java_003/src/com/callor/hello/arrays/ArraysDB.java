package com.callor.hello.arrays;

public class ArraysDB {
	// 배열 10개르 만들고 배열안의 숫자를 랜덤으로 지정한 후
	// 짝수들만 출력이 되게끔 하고 짝수들의 합이 보이게 출력하라
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0; i < 10; i++) {
			nums[i] = (int)(Math.random()*50)+51;
		}
		for(int i = 0; i < 10; i++) {
			if(nums[i] % 2 == 0) {
				System.out.printf("%d 번 요소의 값 : %d\n",i,nums[i]);
			}
		}
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			if(nums[i] % 2 == 0) {
				sum += nums[i];
			}
		}
		System.out.printf("짝수들의합 : "+sum);
	}

}
