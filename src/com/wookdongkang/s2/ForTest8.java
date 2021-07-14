package com.wookdongkang.s2;

import java.util.Scanner;

public class ForTest8 {
	public static void main(String[] args) {
		System.out.println("Test8 Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("분을 입력하세요");
		int inputMin = sc.nextInt();
		System.out.println("초를 입력하세요");
		int inputSec = sc.nextInt();
		for (int min = 0; min < 60; min++) {
			for (int sec = 0; sec < 60; sec++) {
				System.out.println(min + "분 : " + sec + "초");
				if (inputSec == sec && inputMin == min) {
					break;
				}
			}
			if (min == inputMin) {
				break;
			}
		}
		System.out.println("Test8 Finish");
	}
}
