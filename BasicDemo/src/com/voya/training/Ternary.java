package com.voya.training;

public class Ternary {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
		int c = (x>y && x>z) ? x :  (y>z) ? y : z;
		System.out.print(c);
		
		String result = (x>y && x>z) ? " is Greater": (y>z) ?" is greater" : " is greater";
		System.out.println(result);
	}

}
