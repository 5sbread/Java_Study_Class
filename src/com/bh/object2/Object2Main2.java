package com.bh.object2;

import java.util.Scanner;

public class Object2Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Dog | 2.Cat | Rabbit");
		int select = sc.nextInt();
		
		System.out.println("횟수를 입력하세요.");
		int count = sc.nextInt();
		
//		이렇게 쓰면 코드가 너무 길어지기 때문에 분리하기 -> 클래스로
//		if(select==1) {
//			System.out.println("멍멍");
//		}else if (select==2) {
//			System.out.println("냥냥");
//		}else {
//			System.out.println("어흥");
//		}

		//-----------------------------------
		//객체부터 생성하기 -> 1개만 만들어서 메서드 호출
		AnimalSound as = new AnimalSound();
		for(int i=0; i<count; i++) {
			if(select==1) {
				as.dogSound();
			}else if(select==2) {
				as.catSound();
			}else {
				as.tigerSound();
			}
		}
		
	}

}
