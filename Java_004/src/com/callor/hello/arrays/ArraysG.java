package com.callor.hello.arrays;

public class ArraysG {
	
	public static void main(String[] args) {
		
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] gradeScore = new int[STUDENT_LENGTH];
		
		
		for(int i = 0; i < scoreKors.length; i++) {
			scoreKors[i] = (int)(Math.random()*50)+ 51;
		}
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			scoreKors[i] += gradeScore[i];
		}
	}

}
