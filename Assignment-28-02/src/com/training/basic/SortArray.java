package com.training.basic;

import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
;		int []nums = new int[size];
		int temp;
		System.out.println("Enter values for nums array: ");
		
		//input
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if (nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array : ");
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		sc.close();
	}

}
