package com.callor.iolist.exec;

import com.callor.iolist.service.IoListService;
import com.callor.iolist.service.impl.IoListServiceImplV1;

public class Exec {
	
	public static void main(String[] args) {
		
		String ioFile = "src/com/callor/iolist/Iolist.csv";
		IoListService ioService = new IoListServiceImplV1(ioFile);
		ioService.loadIoList();
		ioService.printIoList(null);
	}

}
