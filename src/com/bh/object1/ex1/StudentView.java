//모든 메서드명을 View로 통일해서 오버 로딩하기

package com.bh.object1.ex1;

public class StudentView {
	
	//viewMessage
	//문자열을 받아서 그 문자열을 출력
	public void view(String message) {
		System.out.println(message);
	}

	
	//ViewOne
	//학생 한명의 정보를 받아서 모든 정보를 출력
	public void view(Student student) {
		System.out.println("이름 : "+student.name);
		System.out.println("번호 : "+student.num);
		System.out.println("국어 점수 : "+student.kor);
		System.out.println("영어 점수 : "+student.eng);
		System.out.println("수학 점수 : "+student.math);
		System.out.println("총합 : "+student.total);
		System.out.println("평균 : "+student.avg);
	}
	
	
	//viewAll
	//학생들의 정보를 받아서 모든 정보를 *출력만* (Student.clss 사용)
	//이름 번호 국어 영어 수학 총점 평균
	//-> StudentController에서 사용
	
	public void view(Student [] students) {
		//여러 학생의 정보를 배열로 묶어서 받아옴
		
		for(int i=0; i<students.length; i++) {
			System.out.println("이름 : "+students [i].name);
			System.out.println("번호 : "+students [i].num);
			System.out.println("총합 : "+students [i].total);
			System.out.println("평균 : "+students [i].avg);
		}
		
	}
	
}
