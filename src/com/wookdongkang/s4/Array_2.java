package com.wookdongkang.s4;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("과목수를 입력하세요.");
		int count = sc.nextInt();
		int [] nums = new int[count];
		int total=0;
		for(int i=0; i<count; i++) {
			System.out.println(i+1+"번째 과목의 점수를 입력하세요.");
			nums[i] = sc.nextInt();
			total += nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println("첫번째 과목의 점수는 "+nums[i]);
		}
		double avg = total/nums.length;
		System.out.println("총점은 " +total+"점 입니다.");
		System.out.println("평균은"+avg+" 점 입니다.");
	}
}
