package com.callor.iolist.models;

public enum IoListIndex {
	
	거래일자(0),상품명(4),거래처명(5), 대표자명(6),구분(7), 매입단가(8), 판매단가(9),수량(10);
	
	public int index;
	IoListIndex(int index) {
		this.index = index;
	}
	public int IoListsIndex() {
		return index;
	}
}
