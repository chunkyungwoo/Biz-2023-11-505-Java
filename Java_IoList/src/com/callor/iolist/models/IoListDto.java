package com.callor.iolist.models;

public class IoListDto extends Object{
	
	public String date; // 거래일자
	public String pricename; // 상품명
	public String clientname; // 거래처명
	public String onername; //대표자명
	public String sortation; //구분
	public String buyprice; //매입단가
	public String saleprice; //판매단가
	public String number; //수량
	
	public IoListDto(String date, String pricename, String clientname, String onername, String sortation, String buyprice, String saleprice, String number) {
		super();
		this.date = date;
		this.pricename = pricename;
		this.clientname = clientname;
		this.onername = onername;
		this.sortation = sortation;
		this.buyprice = buyprice;
		this.saleprice = saleprice;
		this.number = number;
	}
	
	public String toString() {
		return "IoListDto [ date=" + date + ", pricename=" + pricename + ",clientname=" + clientname + ",onername=" + onername + 
				",sortation=" + sortation + ", buyprice=" + buyprice + ", saleprice=" + saleprice + ", number=" + number + "]";
	}
}
