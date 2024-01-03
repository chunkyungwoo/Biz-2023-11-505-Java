package com.callor.guid.exec;

import com.callor.service.impl.GuidService;
import com.callor.service.impl.GuidServiceImplV1;

public class Exec {
	
	public static void main(String[] args) {
		
		String guidFile = "src/guid.txt";
		GuidService GuService = new GuidServiceImplV1(guidFile);
		
		GuService.loadGuid();
		GuService.printGuid(null);
		
	}

}
