package com.callor.student.exec;

import com.callor.student.service.StartService;
import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StartServiceImplV2;
import com.callor.student.service.impl.StudentServiceImplV1;

public class MainExA {
	
	public static void main(String[] args) {
		String studunetDataFile = "src/com/callor/student/data/Student.txt";
		StudentService stService = new StudentServiceImplV1();
		StartService start = new StartServiceImplV2(stService);
		start.startApp();
	}

}
