package com.wookdongkang.s2;

import java.util.Scanner;

public class ForTest3 {
	public static void main(String[]args) {
		System.out.println("ForTest Start");
		Scanner sc = new Scanner(System.in);
		int endTime = sc.nextInt();
		//종료 시간을 입력 받기
		//단 60 상수는 변경 불가능
		for(int sec=0; sec<60; sec++) {
			System.out.println(sec+"초");
			if(sec==endTime) {
				sec=60;
			}
		}
		System.out.println("ForTest Finish");
	}
}
