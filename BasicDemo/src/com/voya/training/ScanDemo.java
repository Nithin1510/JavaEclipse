package com.voya.training;
import java.util.Scanner;

public class ScanDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a atring : ");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.print("Enter an employeeId : ");
		int age = sc.nextInt();
		System.out.println(age);
	
		 sc.nextLine();
		
		System.out.print("Enter city :");
		String city = sc.nextLine();
		System.out.println(city);
		
		System.out.print("Enter salary :");
		double sal = sc.nextDouble();
		System.out.println(sal);
		
		sc.close();
	}
}
