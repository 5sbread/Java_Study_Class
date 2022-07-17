package com.bh.object1.ex1;

public class Student {
	
	//private으로 만들어서 값 보호
	private String name;
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;

	public void setTotal() {
		/*멤버변수->*/this.total = this.kor + eng + math;
//	      	//만들어진 파일(메서드)내ㅔ서 자동 생성되는 변수 / 생략 가능
//		//파란 글씨 : 멤버 변수
//		//갈색 글씨 : 지역 변수
//		
//		//지역 변수와 멤버변수 구분할 때도 this.  사용
//		
		this.setAvg(); //평균 메서드 호출 (실행함)
	}
	
	private int checkPoint(int point) {
		if(point<0 || point>100) {
			return 0;
		}else {
			return point;
		}
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = this.checkPoint(kor);
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = this.checkPoint(eng);
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = this.checkPoint(math);
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}

	private void setAvg() {
		this.avg = this.total/3.0;
	}
	
}
