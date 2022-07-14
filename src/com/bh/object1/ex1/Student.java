package com.bh.object1.ex1;

public class Student {

	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	public void setTotal() {
		/*멤버변수->*/this.total = this.kor + eng + math;
	      	//만들어진 파일(메서드)내ㅔ서 자동 생성되는 변수 / 생략 가능
		//파란 글씨 : 멤버 변수
		//갈색 글씨 : 지역 변수
		
		//지역 변수와 멤버변수 구분할 때도 this.  사용
		
		this.setAvg(); //평균 메서드 호출 (실행함)
	}
	
	public void setAvg() {
		this.avg = this.total/3.0;
	}
	
}
