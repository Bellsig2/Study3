package com.wookdongkang.s4;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar1 = new int [2];
		ar1[0] = 10;
		ar1[1] = 20;
		
		int [] ar2;
		ar2 = ar1;
		// 주소만 복사하는 얕은 복사
		ar1[1] =1111;
		System.out.println(ar2[1]);
		int [] ar3 = new int[ar1.length];
		System.out.println(ar3[0]);
		for(int i=0; i<ar1.length; i++) {
			ar3[i]=ar1[i];
			//배열을 복사하는 깊은 복사
		}
		
	}

}
