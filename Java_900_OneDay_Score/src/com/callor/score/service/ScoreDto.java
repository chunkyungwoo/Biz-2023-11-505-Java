package com.callor.score.service;

public class ScoreDto {
	
	public String stdNum;
	
	public int kor;
	public int eng;
	public int math;
	public int music;
	public int art;
	public int total;
	public float avg;
	
	public int getTotal() {
		total = kor;
		total += eng;
		total += math;
		total += music;
		total += art;				
		return total;				
	}
	public float getAvg() {
		getTotal();
		avg = (float)total / 5;
		return avg;
	}
	
			

}
