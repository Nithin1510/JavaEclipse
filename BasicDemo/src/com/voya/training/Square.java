package com.voya.training;
import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
;		int []nums = new int[size];
		int []squares = new int[nums.length];
		System.out.println("Enter values for nums array: ");
		
		//input
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		
		//squaring
		for(int i=0;i<nums.length;i++) {
			squares[i] = nums[i] * nums[i];  
		}
		
		System.out.println("Squares of the array values are :");
		for (int i : squares) {
			System.out.println(i);
		}
		sc.close();
	}
}
