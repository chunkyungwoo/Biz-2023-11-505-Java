package com.callor.hello.prime;

public class PrinmA {
	public static void main(String[] args) {
		
		System.out.println("========================");
		System.out.println("9는 Prime Number 인가?");
		System.out.println("------------------------");
		int num = 0;
		num = 9;
		for(int i =2; i <num; i++) {
			
			System.out.printf("%d MOD %d = %d\n" , num , i , num % i);
			
		}
		
	}
	

	}


