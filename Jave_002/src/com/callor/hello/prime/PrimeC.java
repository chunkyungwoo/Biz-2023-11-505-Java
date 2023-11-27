package com.callor.hello.prime;

public class PrimeC {
	public static void main(String[] args) {
		int num = 0;
		num = 7;
		System.out.println("=============================");
		System.out.printf("%d는 Prime Number 인가?\n", num);
		System.out.println("-----------------------------");
		for(int index = 2 ; index < num ; index++) {
			if(num % index == 0) {
				System.out.printf("%d MOD %d = %d , %d는 소수가 아님\n", num);
				
			}
			if(num % index ==0) {
				System.out.printf("%d MOD %d = %d , %d는 소수");
			}
		}
	}

}
