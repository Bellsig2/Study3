package com.wookdongkang.s4;

import java.util.Scanner;

public class Array_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ids = { 1234, 4567, 4356, 1268 };
		int[] pws = { 6789, 5437, 1235, 9874 };
		boolean flag = true;
		boolean login = true;
		boolean join = true;
		// 1. 로그인
		// 2. 회원가입
		// 3. 종료
		while (flag) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 종료");
			int select = sc.nextInt();
			// 로그인
			if (select == 1) {
				System.out.println("아이디를 입력하세요");
				int insertID = sc.nextInt();
				System.out.println("비밀번호를 입력하세요");
				int insertPW = sc.nextInt();
				for (int i = 0; i < ids.length; i++) {
					if (insertID == ids[i] && insertPW == pws[i]) {
						System.out.println("로그인에 성공하였습니다.");
						login = true;
						break;
					} else {
						login = false;
					}
				}
				if (login == false) {
					System.out.println("로그인 실패");
				}
			} else if (select == 2) {
				int[] ids2 = new int[ids.length + 1];
				int[] pws2 = new int[pws.length + 1];
				System.out.println("회원가입 id를 입력하세요.");
				int joinID = sc.nextInt();
				System.out.println("회원가입 pw를 입력하세요.");
				int joinPW = sc.nextInt();
				for (int i = 0; i < ids.length; i++) {
					if (joinID == ids[i]) {
						System.out.println("중복된 아이디 입니다.");
						join = false;
					}
				}
				if (join == false) {
					continue;
				}
				for (int i = 0; i < ids.length; i++) {
					ids2[i] = ids[i];
					pws2[i] = pws[i];
				}
				ids2[ids.length] = joinID;
				pws2[pws.length] = joinPW;
				ids = ids2;
				pws = pws2;
			} else {
				flag = false;
			}
		}
	}
}
