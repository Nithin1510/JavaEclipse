package com.voya.training;
import java.util.Scanner;
public class SumAndAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []nums = new int[4];
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
