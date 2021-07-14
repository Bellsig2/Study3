package com.wookdongkang.s2;

import java.util.Scanner;

public class ForTest6 {
	public static void main(String[] args) {
		System.out.println("Test6 Start");
		Scanner sc = new Scanner(System.in);
		// 회원가입시 입력한 ID
		int id = 1234;
		// 회원가입시 입력한 PW
		int pw = 5678;
		// 최대 5번 기회
		// 1. 최대 5번 로그인 시도
		// 2.
		int i=0;
		System.out.println("아이디를 입력해주세요.");
		int checkID = sc.nextInt();
		System.out.println("비밀번호를 입력해주세요.");
		int checkPW = sc.nextInt();

		if (checkID != id || checkPW != pw) {
			for (i = 0; i < 4; i++) {
				System.out.println("아이디나 비밀번호가 옳지 않습니다.");
				System.out.println("아이디를 다시 입력해주세요.");
				checkID = sc.nextInt();
				System.out.println("비밀번호를 다시 입력해주세요.");
				checkPW = sc.nextInt();
			}
		}
		if (i < 4) {
			System.out.println("로그인성공");
		}
		else {
			System.out.println("로그인 실패 은행에 방문");
		}
		System.out.println("Test6 Finish");

	}
}
