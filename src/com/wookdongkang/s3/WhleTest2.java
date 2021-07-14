package com.wookdongkang.s3;

import java.util.Scanner;

public class WhleTest2 {

	public static void main(String[] args) {
		System.out.println("Test2 Start");
		Scanner sc = new Scanner(System.in);
		// 1. 로그인
		// 2. 종 료
		int id = 1234;
		int pw = 5678;
		boolean flag = true;
		boolean check = true;
		while (flag) {
			System.out.println("1. 로그인");
			System.out.println("2. 종  료");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("아이디를 입력하세요.");
				int checkID = sc.nextInt();
				System.out.println("비밀번호를 입력하세요.");
				int checkPW = sc.nextInt();
				if (checkID == id && checkPW == pw) {
					System.out.println("로그인에 성공하셨습니다.");
					check = false;
					break;
				} else {
					System.out.println("로그인에 실패하셨습니다.");
					break;
				}
			case 2:
				flag = false;
			}
			if (check == false) {
				flag = false;
			}
		}

		System.out.println("Test2 Finish");

	}

}
