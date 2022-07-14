package com.bh.object1.ex1;

import java.util.Scanner;

public class StudentController {
		
		Scanner sc = new Scanner(System.in);

		//객체 생성
		StudentService studentService = new StudentService();
		StudentView studentview = new StudentView();
		
		//변수 선언
		Student [] students = null;

		public StudentController() {
			sc = new Scanner(System.in);
			studentview = new StudentView();
			studentService = new StudentService();
		}	//studentConlloer는 sv, ss에 의존적 (참조가 필요)
			
		
		public void start () {
			//start 메서드 선언
//	System.out.println("1. 학생정보 입력");
//	System.out.println("2. 학생정보 조회");
//	System.out.println("3. 학생정보 검색");
//	System.out.println("4. 학생정보 삭제");
//	System.out.println("5. 학생정보 추가");
//	System.out.println("6. 프로그램 종료"); 
		boolean check = true;
		
		while(check){
			System.out.println("1. 학생정보 입력");
			System.out.println("2. 학생정보 조회");
			System.out.println("3. 학생정보 검색");
			System.out.println("4. 학생정보 삭제");
			System.out.println("5. 학생정보 추가");
			System.out.println("6. 프로그램 종료");	
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				students = studentService.makeStudents();
				//1번을 누르면 값이 null이 아니게
				break;
			case 2:
				studentview.view(students);
				//students를 통해 데이터 보내기
				break;
			case 3:
				Student student = studentService.findStudent(students);
				if(student != null) {
					studentview.view(student);
				}else {
					studentview.view("해당하는 학생 정보가 존재하지 않습니다.");
				}
				
				break;
			case 4:
				System.out.println("4");
				break;
			case 5:
				System.out.println("5");
				break;
			default:
				System.out.println("종료 중");
				check =! check;
			}
			
		}
	}
	

}
