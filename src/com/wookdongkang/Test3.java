package com.wookdongkang;

import java.util.Scanner;

public class Test3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Test3 Start3");
		System.out.println("총 금액을 입력해주세요.");
		int orderPrice = sc.nextInt();
		int takePrice = 3000;
		if(orderPrice>=30000) {
			System.out.println("주문금액은" + orderPrice + "원 입니다.");
		}
		else {
			System.out.println("주문금액은"+orderPrice+takePrice+"원 입니다.");
		}
		System.out.println("Test3 Finish");
	}
}
