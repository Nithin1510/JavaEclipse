package com.training.basic;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
;		int []nums = new int[size];
		System.out.println("Enter values for nums array: ");
		
		//input
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("Reversed Array : ");
		for(int i=nums.length-1;i>=0;i--) {
			System.out.println(nums[i]);
		}
		sc.close();

	}

}
