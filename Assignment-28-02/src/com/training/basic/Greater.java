package com.training.basic;

public class Greater {

	public static void main(String[] args) {
		int[] array = {12,23,34,56,54,67,78,9,7};
		int big = array[0];
		for(int i=1;i<array.length;i++) {
			if (array[i] > big) {
				big = array[i];
			}
		}
		System.out.println("Greater value is : "+ big);

	}

}
