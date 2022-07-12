package com.bh.object1.ex1;

public class StudentMain {

	public static void main(String[] args) {
		System.out.println("시작");
		//student controller의 start 메서드 호출
		
		StudentController studentController = new StudentController();
		studentController.start();
		
		System.out.println("종료");

	}

}
