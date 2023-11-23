package com.callor.hello.algorithm;

public class AlgF {
	public static void main(String[] args) {
		
		/*
		 * 우리나라 화폐는
		 * 5만, 1만 ,5천, 5백, 1백, 50, 10원 단위이다
		 * 아래 pay 에 저장된 값에서
		 * 각각 화폐단위만큼 몇개씩이 포함되는지
		 * 출력하시오
		 */
		
		int pay = 3587960;
		
		System.out.println("5만원권 갯수 = " + pay / 50000 );
		pay = pay % 50000;
		System.out.println("1만원권 갯수 = " + pay / 10000);
		pay = pay % 10000;
		System.out.println("5천원권 갯수 = " + pay / 5000);
		pay = pay % 5000;
		System.out.println("1천원의 갯수 = " + pay / 1000);
		pay = pay % 1000;
		System.out.println("5백원의 갯수 = " + pay / 500);
		pay = pay % 500;
		System.out.println("1백원의 갯수 = " + pay / 100);
		pay = pay % 100;
		System.out.println("50원의 갯수 = " + pay / 50);
		pay = pay % 50;
		System.out.println("10원의 갯수 = " + pay / 10);
	}

}
