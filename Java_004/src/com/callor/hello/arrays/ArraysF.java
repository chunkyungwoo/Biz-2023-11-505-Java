package com.callor.hello.arrays;

public class ArraysF {
	
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEng = new int[STUDENT_LENGTH];
		int[] scoreMath = new int[STUDENT_LENGTH];
		int[] sums = new int[STUDENT_LENGTH];
		float []avgs = new float[STUDENT_LENGTH];
		
		for(int i = 0; i < scoreKors.length; i++) {
			scoreKors[i] = (int)(Math.random()*50)+ 51;
		}
		for(int i = 0; i < scoreEng.length; i++) {
			scoreEng[i] = (int)(Math.random()*50)+ 51;
		}
		for(int i = 0; i < scoreMath.length; i++) {
			scoreMath[i] = (int)(Math.random()*50)+ 51;
		}
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			sums[i] += scoreKors[i];
			sums[i] += scoreMath[i];
			sums[i] += scoreEng[i];
		}
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			avgs[i] = (float)sums[i] / 3;
		}
		System.out.println("=".repeat(50));
		System.out.println("샛별반 성적표");
		System.out.println("-".repeat(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			
		}
		
	}

}
