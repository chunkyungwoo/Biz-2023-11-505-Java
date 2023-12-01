package com.callor.hello.prime;

public class PrimeG {
	
	public static void main(String[] args) {
		
		System.out.println("=====================");
		System.out.println("2 ~ 100 까지 수 중 소수만 출력하기");
		System.out.println("---------------------");
		for(int num = 0; num <100; num++) {
			int index = 0;						
			for(index = 2; index < num; index++) {
				if(num % index == 0) {					
					break;
				}
				
			}
			if(index < num) {
				System.out.println(num + " 소수가 아님");
			}else {
				System.out.println(num + " 는 소수임");
			}
		}
	}

	}


