package com.training.basic;

public class Smallest {
	public static void main(String[] args) {
		int[] array = {12,3,34,56,5,67,78,9,7};
		int small = array[0];
		for(int i=1;i<array.length;i++) {
			if (array[i] < small) {
				small = array[i];
			}
		}
		System.out.println("Greater value is : "+ small);

	}
}
