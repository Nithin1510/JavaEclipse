package com.voya.training;

public class Greater {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
		if (x>y && x>z) {
			System.out.println("Greatest is : " + x);
		}else if (y>z) {
			System.out.println("Greatest is : " + y);
		}else {
			System.out.println("Greatest is : " + z);
		}
	}
}
