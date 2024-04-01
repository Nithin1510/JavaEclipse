package com.oops.basics;

public class EmpMain {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.employeeName = "Raju";
		employee.employeeId = 1234;
		employee.salary = 20000;
		System.out.println("Name "+ employee.employeeName);
		System.out.println("Id "+ employee.employeeId);
		System.out.println("Saalry "+ employee.salary);
		
		System.out.println();
		
		Employee employee1 = new Employee();
		employee1.employeeName = "sirish";
		employee1.employeeId = 2345;
		employee1.salary = 30000;
		System.out.println("Name "+ employee1.employeeName);
		System.out.println("Id "+ employee1.employeeId);
		System.out.println("Saalry "+ employee1.salary);
	}

}
