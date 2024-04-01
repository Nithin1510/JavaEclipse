package com.voya.training;

import com.voya.exceptions.InvalidNumException;

public class Student {
	
	public int totalMarks(int marks1, int marks2, int marks3) {
		if (marks1 < 0 || marks2 < 0 || marks3 < 0)
			throw new InvalidNumException("Marks should be greater than 0");
		if (marks1 > 100 || marks2 > 100 || marks3 > 100)
			throw new InvalidNumException("Marks should be less than 100");
		return marks1+marks2+marks3;
	}
	
//	public String getGrades(int[] marks) {
//		
//		
//	}
}
