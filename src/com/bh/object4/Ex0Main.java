package com.bh.object4;

public class Ex0Main {

	public static void main(String[] args) { //<-메서드
		//객체 만들기
		Ex0Resume r = new Ex0Resume();
//양식파일 이름 |이름붙이기 = 새로만들기 | 파일이름을();
		Ex0Resume r2 = new Ex0Resume();
//		동일한 양식을 새로 복사 -> 종이 2장
		
		r = new Ex0Resume();
//    종이 1장에 한번 더 복사
		
		r.name = "b"; //종이에 이름 적기
		r2.name = "k";
		

	}

}
