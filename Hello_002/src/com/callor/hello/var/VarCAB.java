package com.callor.hello.var;

public class VarCAB {
	public static void main(String[] args) {
		
		// 선언하는 곳
		int scoreKor = 90;
		int scoreEng = 70;
		int scoreMath = 80;
		
		int total = 0;
		int avg = 0;
		
		// 데이터를 변수에 할당하는 곳
		scoreKor = 
		scoreEng = 80;
		scoreMath = 70;
		
		//계산하는 부분
		total = scoreKor + scoreEng + scoreMath;
		avg = total / 3;
		
		//출력하는 부분
		System.out.println("===================");
		System.out.println("성적표");
		System.out.println("===================");
		System.out.println("국어 : " + scoreKor);
		System.out.println();
	}

}
