package com.wookdongkang;

public class Test9 {
	public static void main(String[]args) {
		System.out.println("Test9 Start");
		boolean check = true;
		
		check = !check;
		if(!check) {
			System.out.println("TEst");
		}
		
		int age = 30;
		//조건식 ? true일 때 실행 : false 일 때 실행
		String result = age > 19 ? "성년" : "미성년";
		System.out.println("Result : " + result);
		System.out.println("Test9 Finish");
	}
}
