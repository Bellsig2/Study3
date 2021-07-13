package com.wookdongkang;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("Test5 Start");
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int password = 5678;
		System.out.println("ID를 입력하세여");
		int saveID = sc.nextInt();
		System.out.println("비밀번호를 입력하세요.");
		int savePassword = sc.nextInt();
		if (id == saveID && password == savePassword) {
			System.out.println("로그인 성공");
		}
		System.out.println("Test5 Finish");
	}
}
