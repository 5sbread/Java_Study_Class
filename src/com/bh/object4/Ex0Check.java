package com.bh.object4;

public class Ex0Check {

	//이력서 컷트
	//기준 : 나이 
	
	
	
//		리턴하는 값의 타입	
	public boolean resumeCut(Ex0Resume r) {
		if(r.age>=40) {
			return false;
		}else {
			return true;
		}
	}
	
}
