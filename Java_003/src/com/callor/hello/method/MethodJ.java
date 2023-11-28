package com.callor.hello.method;

public class MethodJ {
	
	public static boolean isEven(int num) {	
			if(num % 2 == 0) {
				return true;
				
	}
 		    return false;
	}
	
	public static void main(String[] args) {
		
		for(int index = 0; index < 5; index++) {
			int num = (int)(Math.random()* 100) +1;
			boolean isEven = isEven(num);
			if(isEven) {
				System.out.println(num + "는 짝수다");
			}else {
				System.out.println(num + "는 홀수이다");
			}
		}
		
	}

}
