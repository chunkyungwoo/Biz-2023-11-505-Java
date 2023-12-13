package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.utils.Line;

public class ScoreService {
	int sumKor;
	int sumEng;
	int sumMath;
	int sumMusic;
	int sumArt;
	int sumTotal;
	float AvgKor;
	float AvgEng;
	float AvgMath;
	float AvgMusic;
	float AvgArt;
	float sumAvg;
	private List<ScoreDto> scores = null;
	
	public ScoreService() {
		scores = new ArrayList<ScoreDto>();
	}	
	public void inputScore() {
		int scoreKor = 0;
		int scoreEng = 0;
		int scoreMath = 0;
		int scoreMusic = 0;
		int scoreArt = 0;

		for(int i =0; i < 10; i++) {
			scoreKor = (int)(Math.random()* 50) +51;
			scoreEng = (int)(Math.random()* 50) +51;
			scoreMath = (int)(Math.random()* 50) +51;
			scoreMusic = (int)(Math.random()* 50) +51;
			scoreArt = (int)(Math.random()* 50) +51;
			String strStdNum = "23000";
			if(scores.size()>0) {
				strStdNum = scores.get(scores.size() -1).stdNum;
			}
			int intStdNum = Integer.valueOf(strStdNum.substring(2));
			intStdNum++;
			strStdNum = String.format("23%04d",intStdNum);
			
			ScoreDto scoreDto = new ScoreDto();
			
			scoreDto.stdNum = strStdNum;
			scoreDto.kor = scoreKor;
			scoreDto.eng = scoreEng;
			scoreDto.math = scoreMath;
			scoreDto.music = scoreMusic;
			scoreDto.art = scoreArt;
			sumKor += scoreKor;
			sumEng += scoreEng;
			sumMath += scoreMath;
			sumMusic += scoreMusic;
			sumArt += scoreArt;
			sumTotal = sumKor + sumEng + sumMath + sumMusic + sumArt;
			scores.add(scoreDto);
		}
		AvgKor = (float)sumKor / 10;
		AvgEng = (float)sumEng / 10;
		AvgMath = (float)sumMath / 10;
		AvgMusic = (float)sumMusic / 10;
		AvgArt = (float)sumArt / 10;
		sumAvg = (AvgKor + AvgEng + AvgMath + AvgMusic + AvgArt) /5;
	}
	public void printScore() {
		
		Line.dLine(70);
		System.out.println("* 한울 고교 새별 반 성적 리스트 *");
		Line.dLine(70);
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		Line.sLine(70);
		for(ScoreDto dto : scores) {
			System.out.printf("%s\t",dto.stdNum);
			System.out.printf("%3d\t",dto.kor);
			System.out.printf("%3d\t",dto.eng);
			System.out.printf("%3d\t",dto.math);
			System.out.printf("%3d\t",dto.music);
			System.out.printf("%3d\t",dto.art);
			System.out.printf("%3d\t",dto.getTotal());
			System.out.printf("%3f\n",dto.getAvg());
		}
		Line.sLine(70);
		System.out.print("총점");
		System.out.printf("\t%d\t",sumKor);
		System.out.printf("%d\t",sumEng);
		System.out.printf("%d\t",sumMath);
		System.out.printf("%d\t",sumMusic);
		System.out.printf("%d\t",sumArt);
		System.out.println(sumTotal);
		System.out.print("평균");
		
		System.out.printf("\t%.2f",AvgKor);
		System.out.printf("\t%.2f",AvgEng);
		System.out.printf("\t%.2f",AvgMath);
		System.out.printf("\t%.2f",AvgMusic);
		System.out.printf("\t%.2f",AvgArt);
		System.out.printf("\t\t%.2f\n",sumAvg);
		Line.dLine(70);
	}
	
	

}
