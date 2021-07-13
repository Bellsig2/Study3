package com.wookdongkang;

import java.util.Scanner;

public class Test14 {
	public static void main(String[]args) {
		System.out.println("Test14 Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("평균을 입력해 주세요");
		int avg = sc.nextInt() ;
		switch(avg/10) {
		case 9,10 :
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		System.out.println("Test14 Finish");
	}
}
