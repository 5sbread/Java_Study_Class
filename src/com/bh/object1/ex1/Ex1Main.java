package com.bh.object1.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("시작");
		
//		Student st1 = new Student();
//		st1.name = "bh";
//		st1.num = 1
//				
//		Student st2 = new Student();
//		Student st2 = new Student();
		
		Student st = null;
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student [3];
		
		
		for(int i=0; i<3; I++);
			st = new Student();
			System.out.println("이름을 입력하세요.");
			st.name = sc.next();
			students[i]=st; //student 타입을 모으기 위해서 st 넣어주기
	}
	
		System.out.println(student[0].name);
		System.out.println(student[1].name);
		System.out.println(student[2].name);
		
		System.out.println(st.name);
		
		System.out.println("종료");
	}

}
