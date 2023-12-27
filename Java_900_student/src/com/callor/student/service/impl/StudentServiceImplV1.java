package com.callor.student.service.impl;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;
import com.callor.student.service.StudentService;
import com.callor.student.utils.Line;

public class StudentServiceImplV1 implements StudentService{
	
	private Scanner scan = null;
	private List<StudentDto> studentDto = null;
	
	public StudentServiceImplV1() {
		scan = new Scanner(System.in);
		studentDto = new ArrayList<StudentDto>();
		this.loadStudent();
		
		
	}
	// 한 학생의 정보 입력하여 메모리에 보관하기
	public StudentDto inputStudent(String num) {
		
		for(StudentDto std : studentDto) {
			if(std.num.equals(num)) {
				return std;
			}
		}
		return null;
	}
	// 메모리에 보관된 학생정보 출력하기
	public void printStudent() {
		
		Line.dLine(50);
		System.out.println("찾는 학생이름을 입력하세요(종료하려면 QUIT를 입력");
		String str = scan.nextLine();
		Line.sLine(50);
		if(str.equals("QUIT")) {
			return;
		}
		if(this.inputStudent(str) != null) {
			System.out.println("* 데이터가 없습니다");
		}else{
			
		}
		
		
		
		
	}
	// 파일을 읽기위해 준비
	public void loadStudent() {
		
		Scanner fileScan = null;
		InputStream is = null;
		try {
			is = new FileInputStream("src/com/callor/student/샘플-학생정보 데이터(2023-12-14).txt");					
		} catch (Exception e) {
			e.printStackTrace();
		}
		fileScan = new Scanner(is);
		studentDto = new ArrayList<StudentDto>();
		
		while(fileScan.hasNext()) {
			String line = fileScan.nextLine();
			String[] student = line.split(",");	
			StudentDto stdDto = new StudentDto();
			
			stdDto.num = student[0];
			stdDto.name = student[1];
			stdDto.dept= student[2];
			stdDto.grade= student[3];
			stdDto.tel= student[4];
			stdDto.addr= student[5];
			studentDto.add(stdDto);
		}// end while
		fileScan.close();
	}
	@Override
	public void inputStudent() {
		// TODO Auto-generated method stub
		
	}
	

}
