package com.voya.training;

public class ForDemo {
	public static void main(String[] args) {
		for (int i=1;i<=10;i++) {
			System.out.println("10 * " + i + " = " + (10*i));
		}
		
		
		int x = 0;
		System.out.println("While");
		while(x < 10 ) {
			System.out.println(x);
			x++;
		}
		
		System.out.println("Do while ");
		
		
		do {
			System.out.println(x);
			x--;
		} while(x>0);
	}
}
