package com.callor.score.exec.scores;

import com.callor.score.service.ScoreService;

public class ScoreF {
	
	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();
		
		// 3명의 학생 점수를 입력받아 scoreService.scores 에
		// 추가 해달라
		for(int i = 0; i < 3; i++) {
			scoreService.inputScore();			
		}
		
		//{} : 메인종료전까지 기다려라는 말
		// scoreService.scores 에 저장된 학생의 성적정보를
		// 출력해달라
		scoreService.printScore();
		// while(true) {}
	}

}
