package com.bh.object3;

public class Count {
	
	//메서드 오버로딩
	//같은 이름의 메서드 + 매개변수의 타입 혹은 숫자가 달라야함
	//필요한 경우의 수를 다 적어줘야함
	
	public void /*메서드명*/hap(/*매개변수*/int num1, int num2) {
		System.out.println(num1 + num2);
	}
	//위아래 두개 중복 선언 아님
	public void hap(int num1, double num2) {
		System.out.println(num1 + num2);
	}
	
	
	//1번과 중복 선언 : 매개변수 순서만 바뀌고 *타입 조합*은 그대로
//	public void hap(int num2, int num1) {
//		System.out.println(num1 + num2);
//	}
	//1번과 중복 선언 : 리턴 타입(in/void) 과는 관계없음
//	public in hap(int num1, int num2) {}
}
