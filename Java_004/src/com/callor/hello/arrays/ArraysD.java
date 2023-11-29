package com.callor.hello.arrays;

public class ArraysD {
	
	public static void main(String[] args) {
		
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEng = new int[STUDENT_LENGTH];
		int[] scoreMath = new int[STUDENT_LENGTH];
		
		for(int i = 0; i < scoreKors.length; i++) {
			int rndScore = (int)(Math.random()* 50) + 51;
			scoreKors[i] = rndScore;
		}
		int sum = 0;
		float avg = 0;
		for(int i = 0; i < scoreEng.length; i++) {
			int rndScore = (int)(Math.random()* 50) + 51;
			scoreEng[i] = rndScore;
		}
		for(int i = 0; i < scoreMath.length; i++) {
			int rndScore = (int)(Math.random()* 50) + 51;
			scoreMath[i] = rndScore;
		}
		System.out.println("=".repeat(30));
		System.out.println("샛별반 성적표");
		System.out.println("-".repeat(30));
		System.out.println("국어  영어  수학  총점  평균");
		System.out.println("-".repeat(30));
		
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			sum = scoreKors[i] + scoreEng[i] + scoreMath[i];
			avg = (float) sum / 3;
			System.out.printf("%d    %d    %d    %d   %.2f\n", scoreKors[i] , scoreEng[i] , scoreMath[i] , sum , avg);
		}
		System.out.println("=".repeat(30));
	}

}
