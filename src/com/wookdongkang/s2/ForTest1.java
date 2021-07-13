package com.wookdongkang.s2;

import java.util.Scanner;

public class ForTest1 {
	public static void main(String[] args) {
		System.out.println("ForTest Start");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("반복할 횟수를 입력하세요.");
//		int count = sc.nextInt();
//		for (int i=0; i < count; i++) {
//			System.out.println("Hello World." + i);
//		}
//		==============================================
//		for(int i=1; i<20; i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		for(int i=0; i<20; i=i+2) {
			System.out.println(i);
		}
		System.out.println("ForTest Finish");
	}
}
