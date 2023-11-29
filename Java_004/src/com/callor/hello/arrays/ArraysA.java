package com.callor.hello.arrays;

public class ArraysA {
	
	public static void main(String[] args) {
		
		int num = 0;
		int[] nums = new int[10];
		
		for(int i = 0; i < 10; i++) {
			nums[i] = (int)(Math.random()* 50) + 51;
		}
		for(int i =0; i < 10; i++) {
			if(nums[i] > 80) {
				System.out.printf("index %d");
			}
		}
	}

}
