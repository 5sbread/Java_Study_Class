package com.bh.object1.ex1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class StudentService {

	public StudentService() {
		sc = new Scanner(System.in);
	}
	
	
//-----------------------------------	
	//removestudent
	//학생들의 정보를 받아서
	//삭제하려는 학생의 번호를 입력
	//학생의 번호와 일치하는 학생을 삭제
	//남은 학생 정보 리턴
	public void removestudent (Student[]students) {
		System.out.println("삭제할 학생의 번호를 입력하세요.");
		int select = sc.nextInt();
		boolean flag = false;
		String [] getNameCopy = null;
		int [] getNumCopy = null;
		int [] getKorCopy = null;
		int [] getEngCopy = null;
		int [] getMathCopy = null;
		int [] getTotalCopy = null;
		
		for(int i=0; i<students.length; i++) {
			if(select == getNum(i)){
				flag =! flag;
				break;
			}
		}
		
		
	}
	
	
//-----------------------------------	
	//addstudent
	//학생들의 정보를 받아서
	//학생 한명 추가
	//학생 정보들을 리턴
	public void addstudent (Student [] students) {
	
		
	}  
	
//-----------------------------------	
	//findStudent
	//검색하고 싶은 학생의 번호를 입력받아서
	//같은 번호의 학생을 찾아서 그 학생 한명을 리턴
	//->studentView - viewOne로 보내서 출력
	//학생이 없을 경우 -> viewMessage로 보내서 없음 출력
	Scanner sc = new Scanner(System.in);

	public Student findStudent (Student [] students/*매개변수*/) {
		System.out.println("검색할 학생의 번호를 입력하세요.");
		int num = sc.nextInt();
		
		Student student = null; //리턴하려는 학생 데이터
		
		for(int i=0; i<students.length; i++) { //원하는 번호가 나올 때까지 학생 한명한명 비교
			if(num == students[i].getNum()) {
				student = students[i];
				break; //해당 학생을 찾으면 종료
			}else {
				
			}//else
		}//for
		return student; //못찾으면 18라인의 null 값이 그대로 리턴
	}
	
//-----------------------------------	
	//makeStudents 메서드
	//인원 수 입력 받기
	//학생 수만큼 정보 입력받기
	//이름 번호 국어 영어 수학 총점 평균
	//학생정보를 리턴
	//-> StudentController에서 사용
	public Student [] makeStudents() {
		
		System.out.println("학생 수를 입력하세요.");
		int count = sc.nextInt();
		
		Student [] students = new Student[count];
		
		for(int i=0; i<students.length; i++) {
			Student student = new Student(); //학생 한명 만들기
			
			System.out.println(i+1+"번째 학생 이름을 입력하세요.");
			student.setName(sc.next());
			System.out.println(i+1+"번째 학생의 번호를 입력하세요.");
			student.setNum(sc.nextInt());
			System.out.println(i+1+"번째 학생의 국어 점수를 입력하세요.");
			student.setKor(sc.nextInt());
			System.out.println(i+1+"번째 학생의 영어 점수를 입력하세요.");
			student.setEng(sc.nextInt());
			System.out.println(i+1+"번째 학생의 수학 점수를 입력하세요.");
			student.setMath(sc.nextInt());
			
//			student.total = student.kor + student.eng + student.math;
//			student.avg = student.total/3.0;
			student.setTotal();
			students[i]=student;
			
			System.out.println(i+1+"번째 학생의 총점 : " +student.getTotal()+" | 평균 : "+student.getAvg());
			System.out.println("저장되었습니다.");
			
		}//for
		return students;
	}
	
}
