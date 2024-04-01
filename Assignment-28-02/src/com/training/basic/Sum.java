package com.training.basic;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
;		int []nums = new int[size];
		int sum =0;
		System.out.println("Enter values for nums array: ");
		for(int i=0;i<4;i++) {
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		System.out.println("Sum of the array is : "+sum);
		System.out.println("Average of the array is : "+sum/nums.length);
		sc.close();
	}
}
