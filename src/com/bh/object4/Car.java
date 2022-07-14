package com.bh.object4;

public class Car {
	String company; //null 값이 들어있는 상태
//	String company = "르노"; //멤버변수 선언과 동시에 초기화
	
	String brand;
	String color;
	boolean gear; //true-> auto | false -> self
	
//	public Car () { //생성자 | 파일명과 동일하게
//		this.company = "현대";
//		this.brand = "제네시스";
//		this.color = "블랙";
//		this.gear = true;
//	}
//----------------------
//	{ //인스턴스 초기화 블럭	
//		this.company = "현대";
//		this.brand = "제네시스";
//		this.color = "블랙";
//		this.gear = true;
//	}
//----------------------
	public Car(String brand, String color) {
		this.company = "현대";
		this.brand = "brand";
		this.color = "color";
		this.gear = true;
	}
	
	
	
	public void info() {
		System.out.println("Company : "+this.company);
		System.out.println("Brand : "+this.brand);
		System.out.println("Color : "+this.color);
		System.out.println("Gear : "+this.gear);
	}
	
}
