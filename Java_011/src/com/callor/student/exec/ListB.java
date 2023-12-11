package com.callor.student.exec;

import java.util.ArrayList;
import java.util.List;

public class ListB {
	
	public static boolean check(int check) {
List<Integer> nums = new ArrayList<Integer>();
		// 데이터를 만드는 부분
		for(int i = 0; i < 10; i++) {
			int num = (int)(Math.random()*51)+50;
			nums.add(num);
		}
		System.out.println(nums);
		
		// 데이터를 찾는 부분
		int size = nums.size();
		for(int i = 0; i < size; i++) {
			if(nums.get(i)== check) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		boolean bYes = check(77);
		if(bYes) System.out.println("있다");
		else System.out.println("없다");
		
	}

}
