package com.callor.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.model.GuidDto;
import com.callor.service.utils.Line;

public class GuidServiceImplV1 implements GuidService{
	protected List<GuidDto> GList = null;
	protected String GuidFile = null;
	
	public GuidServiceImplV1(String GuidFile) {
		this.GuidFile = GuidFile;
		this.GList = new ArrayList<GuidDto>();
	}	
	public void loadGuid() {
		InputStream is = null;
		Scanner fileRead = null;
		
		try {
			is = new FileInputStream(this.GuidFile);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		fileRead = new Scanner(is);
		while(fileRead.hasNext()) {
			String line = fileRead.nextLine();
			String[] Guids = line.split(",");
			
			GuidDto Dto = new GuidDto(Guids[0],Guids[1],Guids[2],Guids[3]);
			GList.add(Dto);
		}
		fileRead.close();
	}
	@Override
	public void printGuid(GuidDto GDto) {
		// TODO Auto-generated method stub
		Line.dLine(70);
		System.out.println("id\t종목명\t순서\t방법\t");
		Line.sLine(70);
		
		for(GuidDto dto : GList) {
			System.out.printf("%s\t", dto.id);
			System.out.printf("%s\t", dto.종목명);
			System.out.printf("%s\t", dto.순서);
			System.out.printf("%s\n", dto.방법);
		}
		Line.dLine(70);
		
		
	}

}
