package com.wookdongkang.s2;

public class ForTest4 {
	public static void main(String[] args) {
		System.out.println("ForTest4 Start");
		int sum = 0;
		int input = 5;
		for (int i = 0; i <= 2; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
		System.out.println("총합" + sum);
		System.out.println("ForTest4 Finish");
	}

}
