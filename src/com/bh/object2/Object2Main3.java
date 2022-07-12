package com.bh.object2;

public class Object2Main3 {

	public static void main(String[] args) {
		
		Method3 m3 = new Method3(); //객체 만들기
	//         참조변수
		
		//월급 입력
		int salary = 5000000; //인자값 : 매개변수에 보내는 실제 **값**(매개변수에 대입하는 값) -> Method3에서 변해도 여기서는 변하지 않음
		m3.sal(salary);
		System.out.println(salary); //
		
		
		m3.hap(10, 20);
		
		
		m3.info("영히", 24, "0hee@gmail.com"); //매개변수 호출
		
		Member member = new Member();
		member.name = "bh";
		member.age = 31;
		member.email = "bbh@gmail.com";
		member.num = 01000000000;
		m3.info2(member);
		
		
	}

}
