package com.callor.hello.method;

public class MethodI {
	
	public static int isPrime(int num) {
		for(int index = 2; index < num; index++) {
			if(num % index == 0) {
				return 0;
			}
			
		}return num;
	}
	
	public static void main(String[] args) {
		
		System.out.println("===============================");
		System.out.println("소수 합 구하기");
		System.out.println("-------------------------------");
		int sum = 0;
		for(int index = 0; index < 5 ; index++) {
			int num = (int)(Math.random()* 100) +2;
			int isPrime = isPrime(num);
			
			if(isPrime == 0) {
				System.out.printf("%d 는 소수가아님\n",num);
			}else {
				System.out.printf("%d 는 소수임\n",num);
				sum += num;
			}
			
		}
		System.out.println("-------------------------------");
		System.out.println(" 소수의 합 : " + sum);
		System.out.println("===============================");
	}

}
