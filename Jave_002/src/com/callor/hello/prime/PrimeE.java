package com.callor.hello.prime;

public class PrimeE {
	public static void main(String[] args) {
		
		int num = (int)(Math.random()* 100) + 1;
		int index = 0;
		boolean noPrime = false;
		for(index = 1 ; index < num ; index++) {			
			if(num % index ==0) {
				noPrime = true;
				break;
			}
			
		}
		for(index = 2 ; index < num ; index++) {
			
		}
		System.out.println("=============================");
		System.out.println("소수판별하기");
		System.out.println("-----------------------------");
		if(noPrime) {
			System.out.printf("%d MOD %d = %d=n ", num , index , num % index);
			System.out.printf("%d 는 소수가 아님", num);
		}else {
			System.out.printf("%d 는 소수임\n ", num);
			
		}
	}
	

	}
 
		
	


