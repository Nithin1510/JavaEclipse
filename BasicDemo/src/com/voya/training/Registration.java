package com.voya.training;
import java.util.Scanner;
public class Registration {
	public static void main(String[] args) {
		String []usernames =  {"nithin", "kumar", "reddy", "cheepati", "chandu"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name to register: ");
		String uname = sc.next();
		boolean flag = false;
		for(String username : usernames) {
			if(username.equals(uname)) {
				System.out.println("Name already exists");
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("You are registered");	
		}
		sc.close();
	}

}
