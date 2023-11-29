package com.callor.hello.service;
/*
 * ScoreService 클래스
 * suffix(접미사) service 인 클래스
 * 여기에는 main() method 가 없다
 * 여기에 선언된 method 들은 다른 클래스(파일)에서
 * 호출하여 사용하는 용도이다
 * ScoreService.score() 처럼 클래스.method() 형식으로 사용한다
 * 이때 Service 클래스는 method 들을 모아두는 묶음 역할을 한다
 */

public class ScoreService {
	
	public static int[] score(int length) {
		int[] scores = new int[length];
		for(int i = 0; i < scores.length; i++) {
			scores[i] = (int)(Math.random()* 50)+ 51;
		}
		return scores;
	}
	public static String gradeScore(int score) {
		String result = "F";
		if(score >=95) result = "A+";
		if(score >=90) result = "A";
		if(score >=85) result = "B+";
		if(score >=80) result = "B";
		if(score >=75) result = "C+";
		if(score >=70) result = "C";
		if(score >=65) result = "D+";
		if(score >=60) result = "D";
		return result;

}
}
