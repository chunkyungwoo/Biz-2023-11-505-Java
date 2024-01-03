package com.callor.iolist.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.iolist.models.IoListDto;
import com.callor.iolist.models.IoListIndex;
import com.callor.iolist.service.IoListService;
import com.callor.iolist.utils.Line;

public class IoListServiceImplV1 implements IoListService{
	protected List<IoListDto> iolist = null;
	protected String ioFile = null;
	
	public IoListServiceImplV1(String ioFile) {
		this.ioFile = ioFile;
		this.iolist = new ArrayList<IoListDto>();
	}

	@Override
	public void loadIoList() {
		Scanner filescan = null;
		InputStream is = null;
		
		try {
			is = new FileInputStream(this.ioFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		filescan = new Scanner(is);
		while(filescan.hasNext()) {
			String line = filescan.nextLine();
			String[] IoLists = line.split(",");
			IoListDto dto = new IoListDto(
					IoLists[IoListIndex.거래일자.index],
					IoLists[IoListIndex.상품명.index],
					IoLists[IoListIndex.거래처명.index],
					IoLists[IoListIndex.대표자명.index],
					IoLists[IoListIndex.구분.index],
					IoLists[IoListIndex.매입단가.index],
					IoLists[IoListIndex.판매단가.index],
					IoLists[IoListIndex.수량.index]);
			iolist.add(dto);
		}
		filescan.close();
	}

	@Override
	public void printIoList(IoListDto ioDto) {
		int sum1 = 0;
		int sum2 = 0;
		Line.dLine(80);
		System.out.println("거래일자\t거래처\t상품이름\t매입금액\t판매금액");
		Line.sLine(80);
		for(IoListDto dto : iolist) {
			int num = Integer.valueOf(IoListIndex.수량.index);
			int num1 = Integer.valueOf(IoListIndex.매입단가.index);
			int num2 = Integer.valueOf(IoListIndex.판매단가.index);
		}
		
	}

}
