package com.voya.training;

public class OneDimi {
	public static void main(String[] args) {
		int []marks = new int[4];
		System.out.println(marks[0]);
		System.out.println(marks.length);
		
		marks[0] = 10;
		marks[1] = 20;
		marks[2] = 30;
		marks[3] = 40;
		//marks[4] = 50;
		
//		System.out.println(marks[5]);
		
//		for(int i=0;i<marks.length;i++) {
//			System.out.println(marks[i]);
//		}
		
		for(int mark:marks) {
			System.out.println(mark);
		}
	}
}
