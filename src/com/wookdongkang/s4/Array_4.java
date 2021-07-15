package com.wookdongkang.s4;

public class Array_4 {

	public static void main(String[] args) {
		int [] ar2 = new int [8];
		int [] ar1 = new int [3];
		ar1[0] = 1;
		ar1[1] = 2;
		ar1[2] = 3;
		for(int i=0; i<ar1.length; i++) {
			ar2[i] = ar1[i];
		}
		for(int i=0; i<ar2.length - ar1.length; i++)
		{
			ar2[ar1.length+i] = ar1.length+i+1;
		}
		ar1=ar2;
		for(int i=0; i<ar1.length; i++) {
			System.out.println(ar1[i]);
		}
	}

}
