package com.callor.hello.arrays;

public class ArraysB {
	
	public static void main(String[] args) {
		
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		
		for (int i = 0; i < scoreKors.length; i++) {
			int rndscore = (int)(Math.random()*50)+ 51;
			scoreKors[i] = rndscore;
		}
		int sum = 0;
		for(int i = 0; i < scoreKors.length; i++) {
			sum += scoreKors[i];
		}
		float avg = 0;
		avg = (float)sum / scoreKors.length;
		System.out.println("=".repeat(50));
		System.out.printf("국어 점수 평균 : %d 평균 %.2f\n",sum,avg);
	}

}
