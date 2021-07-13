package com.wookdongkang;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		System.out.println("Test11 Start");
		// 국어, 영어, 수학 입력
		// 총점 평균 계산

		// 평균이 90점 이상이면 A를 출력
		// 평균이 80점 이상이면 B를 출력
		// 평균이 70점 이상이면 C를 출력
		// 평균이 60점 이상이면 D를 출력
		// 그 외 나머지는 F를 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("수학 점수를 입력해 주세요.");
		int math = sc.nextInt();
		System.out.println("국어 점수를 입력해 주세요.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력해 주세요.");
		int eng = sc.nextInt();
		int total = math + kor + eng;
		double avg = total / 3;

		if (avg >= 90) {
			System.out.println("A학점 입니다.");
		} else if (avg >= 80) {
			System.out.println("B학점 입니다.");
		} else if (avg >= 70) {
			System.out.println("C학점 입니다.");
		} else if (avg >= 60) {
			System.out.println("D학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}
	}

}
