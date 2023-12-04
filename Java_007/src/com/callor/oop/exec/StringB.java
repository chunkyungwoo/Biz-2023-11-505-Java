package com.callor.oop.exec;

public class StringB {
	
	public static void main(String[] args) {
		
		String nums = "50,88,70,100,98";
		int num = 0;
		String[] result = nums.split(",");
		for(int i = 0; i < result.length; i++) {
			num += Integer.valueOf(result[i]);
		}
		System.out.println(num);
	}

}
