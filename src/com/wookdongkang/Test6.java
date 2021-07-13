package com.wookdongkang;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		System.out.println("테스트 실행");
		Scanner sc = new Scanner(System.in);
//		int num = 3;
//		if(num%2!=0) {
//			System.out.println("홀수");
//		}
//		else {
//			System.out.println("짝수");
//		}
		System.out.println("국어 점수를 입력 해주세요.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력 해주세요.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력 해주세요.");
		int math = sc.nextInt();
		double avg = (kor + eng + math) / 3;
//		if(avg>=60) {
//			System.out.println("합격입니다.");
//			System.out.println("평균 점수는 " + avg + "점 입니다.");
//		}
//		else {
//			System.out.println("불합격입니다.");
//			System.out.println("평균 점수는 " + avg + "점 입니다.");
//		}
		String check = "불합격";
		if (avg >= 60) {
			check = "합격";
		}
		System.out.println(check + "입니다.");
		System.out.println("테스트 종료");
	}

}
