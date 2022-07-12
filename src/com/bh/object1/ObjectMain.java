package com.bh.object1;

public class ObjectMain {

	public static void main(String[] args) {
		System.out.println("시작");
		//Object 생성
		//클래스명 변수명 = new 클래스명);
		
		Monster monster = new Monster();
		System.out.println(monster);
		//멤버 변수 접근
		//변수명, 멤버면수명
		
		System.out.println(monster);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		
		monster.name = "오크";
		monster.hp = 100;
		monster.level = 5;
		
		System.out.println(monster);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		
		//--------------------------------
		Monster monster2 = new Monster();
		monster2.name = "오크";
		monster2.hp = 
		
		monster.weapon = sword;
		System.out.println(monster.weapon.name);
		System.out.println(monster2.weapon.name);
		
		System.out.println("종료");

	}

}
