package com.bh.object2;

public class Object2Main4 {

	public static void main(String[] args) {
		Member member = new Member();
		member.name = "bh";
		member.age = 31;
		member.email = "bh@gmail.com";

		Member member2 = new Member();
		member2.name = "kk";
		member2.age = 29;
		member2.email = "kk@gmail.com";
		
		Member member3 = new Member();
		member3.name = "ss";
		member3.age = 20;
		member3.email = "ss@gmail.com";
		
		Member [] members = new Member[3];
		members[0] = member;
		members[1] = member;
		members[2] = member;
		
		Method4 m4 = new Method4();
		m4.info(members);
		
		System.out.println(members.length);
		
		
	}

}
