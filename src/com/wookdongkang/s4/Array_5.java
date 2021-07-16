package com.wookdongkang.s4;

import java.util.Scanner;

public class Array_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 정보출력
		// 2. 정보추가
		// 3. 정보삭제
		// 4. 종료
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int[] ar = {1, 2, 3};
		while (check) {
			System.out.println("1. 정보출력");
			System.out.println("2. 정보추가");
			System.out.println("3. 정보삭제");
			System.out.println("4. 종	료");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("정보출력");
				for (int i = 0; i < ar.length; i++) {
					System.out.println("배열의 값은 " + ar[i] + "입니다.");
				}
			} else if (choice == 2) {
				System.out.println("정보추가");
				System.out.println("추가할 값을 입력해주세요.");
				int[] ar2 = new int[ar.length+1];
				int add = sc.nextInt();
				for(int i=0; i<ar.length; i++) {
					ar2[i] = ar[i];
				}
				ar2[ar.length] = add;
				ar=ar2;
			} else if (choice == 3) {
				if(ar.length==0) {
					System.out.println("배열에 값이 없습니다.");
					continue;
				}
				System.out.println("정보삭제");
				int[]ar3 = new int[ar.length-1];
				for(int i=0; i<ar3.length; i++) {
					ar3[i] = ar[i];
				}
				ar=ar3;
			} else if (choice == 4) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못된 번호를 입력하셨습니다.");
			}
		}
	}

}
