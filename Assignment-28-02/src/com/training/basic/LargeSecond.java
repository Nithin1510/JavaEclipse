package com.training.basic;

public class LargeSecond {
	public static void main(String[] args) {
		int[] array = {12,23,34,56,54,67,78,9,7};
		int temp;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Second Greater value is : "+ array[array.length-2]);
	}
}
