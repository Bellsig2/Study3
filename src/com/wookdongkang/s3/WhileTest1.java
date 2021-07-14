package com.wookdongkang.s3;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while (check) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종 료");
			int select = sc.nextInt();
//			if(select==1) {
//				System.out.println("회원가입 코드 진행");
//			}
//			else if(select==2) {
//				System.out.println("로그인 코드 진행");
//			}
//			else {
//				break;
//			}
			switch (select) {
			case 1:
				System.out.println("회원가입 코드 진행");
				break;
			case 2:
				System.out.println("로그인 코드 진행");
				break;
			default:
				System.out.println("종료");
				break;
			}
		}
	}
}
