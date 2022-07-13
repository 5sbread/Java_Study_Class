package com.bh.object3;

import java.util.Random;
import java.util.Scanner;

public class ReturnTest {
Scanner sc = new Scanner(System.in);

	//EX. make Account
	//title, host, 통장번호, 잔액 입력받아서 리턴
	public Account makeAccount() {
		Account account = new Account();
		account.title = "자유입출금";
		account.host = "bh";
		account.numbers = "1234567";
		account.balance =500L;
		
		return account;
	}
	
	
	//호출시 숫자를 받아서 그 숫자만틈 랜덤한 수 뽑아서 리턴
	public int [] makeRandom2(int count) {
		Random random = new Random();
		int [] nums = new int [count];
		
		for(int i=0; i<count; i++) {
//			int nums = random.nextInt(50);
//			nums[i]=num;
			nums[i] = random.nextInt();	
		}
		return nums;
	}
	
	//   리턴하는 데이터에 맞춰서 void 변경
	public int makeRandom() {
		Random random = new Random();
		int num = random.nextInt(50);
		
		return num;
		//return + 리턴하려는 데이터		
	}
	
	
	
	public void info() {
		System.out.println("실행 후 종료");
	}
	
	
}
