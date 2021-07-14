package com.wookdongkang.s2;

import java.util.Scanner;

public class ForTest5 {
	public static void main(String[] args) {
		System.out.println("Test5 Start");
		Scanner sc = new Scanner(System.in);
		// 과목수 입력
		// 과목수 만큼 점수 입력
		// 총점 평균 계산 후 출력
		System.out.println("과목수를 입력해 주세요.");
		int subjects = sc.nextInt(); // 과목 수
		if (subjects < 1) {
			System.out.println("한가지 이상의 수를 입력해 주세요.");
		}
		int total = 0; // 총합
		double avg = 0;
		for (int i = 1; i <= subjects; i++) {
			System.out.println(i + "번째 점수를 입력해 주세요.");
			int score = sc.nextInt(); // 점수
			total = total + score;
			avg = (double)total / subjects;
		}
		System.out.println("총점은 " + total + "점 입니다.");
		System.out.println("평균은 " + avg + "점 입니다.");
		System.out.println("Test5 Finish");
	}
}
