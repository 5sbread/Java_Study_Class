package com.bh.object2;

public class Method3 {

	//sal          매개변수 : 호출한 쪽에서 데이터를 받기 위해 선언
	public void sal(int salary) {
		System.out.println("월급 계산");
		System.out.println(salary*0.967);
		salary = 20;
	}
	
	public void hap(int num1, int num2) { //매개변수 제한X
		System.out.println(num1+num2);
	}
	
	
	//info : 이름 나이 이메일 받아서 출력
	public void info(String name, int age, String email) {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Email : "+email);
	}
	
	
	//               Member 파일에서 새로 추가해도 매개변수를 수정할 필요가 없음
	public void info2(Member member) {
		System.out.println(member.name);
		System.out.println(member.age);
		System.out.println(member.email);
		System.out.println(member.num); //프린트문만 추가
	}
	
	
	
	
}
