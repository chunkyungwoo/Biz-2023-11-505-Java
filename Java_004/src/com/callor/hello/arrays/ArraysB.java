package com.callor.hello.arrays;

public class ArraysB {
	
	public static void main(String[] args) {
		
		int index = 0;
		int scoreKors = 10;
		int[] nums = new int[scoreKors];
		for (int i = 0; i < 10; i++) {
			int rndNum = (int)(Math.random()*50)+ 51;
			nums[i] = rndNum;
		}
		System.out.printf("");
		
	}

}
