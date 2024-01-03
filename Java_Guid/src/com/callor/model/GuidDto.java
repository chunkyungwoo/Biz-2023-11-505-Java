package com.callor.model;

public class GuidDto extends Object{
	
	public String 순서;
	public String 방법;
	public String id;
	public String 종목명; 

	public GuidDto() {
		// TODO Auto-generated constructor stub
	}
	
	
	public GuidDto(String id, String 순서, String 방법, String 종목명) {
		super();
		this.id = id;
		this.순서 = 순서;
		this.방법 = 방법;
		this.종목명 = 종목명;
	}
	public String toString() {
		return "GuidDto [id=" + id + ",순서=" + 순서 + ",방법=" + 방법 + ",종목명=" + 종목명 +"]";
	}

}
