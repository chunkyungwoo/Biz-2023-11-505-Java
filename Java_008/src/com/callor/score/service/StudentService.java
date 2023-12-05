package com.callor.score.service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.StudentDto;

public class StudentService {
	
	private Scanner scan = null;
	private List<StudentDto> students = null;

	public StudentService(String studentFile) {
		InputStream is = null;
		try {
			is = new FileInputStream(studentFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		scan = new Scanner(is);
		students = new ArrayList<StudentDto>();
		
	}
	public void loadscores() {
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] lines = line.split(",");
			StudentDto studentDto = new StudentDto();
			try {
				studentDto.num = lines[0];
				studentDto.name = lines[1];
				studentDto.dept = lines[2];
				studentDto.grade = lines[3];
				studentDto.prof = lines[4];
				studentDto.tel = lines[5];
				studentDto.addr = lines[6];
			} catch (Exception e) {
				System.out.println("데이터 읽는중 오류 발생");
				System.out.println(line);
                break;
			}
			students.add(studentDto);
		}
	}
}
