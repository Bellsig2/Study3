package com.wookdongkang.s4;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 11;
		int num2 = 20;
		num2 = 30;
		int[]numbers = new int[3];
		//numbers의 데이터값 int 배열;
		System.out.println(numbers);
		numbers[0]=10;
		//numbers[0]의 데이터값 int;
		numbers[1]=20;
		numbers[2]=30;
		System.out.println(numbers[0]);
		System.out.println(numbers.length); // 배열의 크기를 알고싶을 때
		// 3.12, 2.3, 4.123, 5.0 배열 선언 데티어 대입
//		double [] data = new double[4];
//		data[0] = 3.12;
//		data[1] = 2.3;
//		data[2] = 4.123;
//		data[3] = 5.0;
//		System.out.println(data[4]);
		//문자열을 담을 배열 3칸짜리 생성
		String[]lang = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println(lang[i]);
	}
		Scanner[]lang2 = new Scanner[2];
		for(int i=0; i<2; i++)
			System.out.println(lang2[i]);
	}

}
