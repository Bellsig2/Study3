package com.wookdongkang;

import java.util.Scanner;

public class Test4 {
	public static void main(String[]args) {
		System.out.println("Test4 Start");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=10 && age < 20) {
			System.out.println("10대 입니다.");
		}
		System.out.println("Test4 Finish");
	}
}
