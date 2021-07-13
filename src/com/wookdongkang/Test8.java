package com.wookdongkang;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		System.out.println("Test8 Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력 해주세요.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력 해주세요.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력 해주세요.");
		int math = sc.nextInt();
		double avg = (kor+eng+math)/3;
		
		if(avg<60 || math<40 || eng<40 || kor<40) {
			System.out.println("불합격입니다.");
		}
		else {
			System.out.println("합격입니다.");
		}
		//합격 기준
		//평균 60점 이상
		//과목당 40점 이상
		System.out.println("Test8 Finish");
	}
}
