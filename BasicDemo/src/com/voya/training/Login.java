package com.voya.training;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String []usernames =  {"nithin", "kumar", "reddy", "cheepati", "chandu"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username to login: ");
		String uname = sc.next();
		boolean flag = false;
		for(String username : usernames) {
			if(username.equals(uname)) {
				System.out.println("You are logged in successfully");
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("Invalid username");	
		}
		sc.close();
	}

}
