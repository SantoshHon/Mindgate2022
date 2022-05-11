package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Employee;

public class EmployeeApplication {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int employeeId;
		String name;
		double salary;
		System.out.println("Enter EmployeeId");
		employeeId = scanner.nextInt();

		System.out.println("Enter name");
		name = scanner.next();
		System.out.println("Enter Salary");
		salary = scanner.nextDouble();
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		employee.setName(name);
		employee.setSalary(salary);

		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());

		System.out.println("-".repeat(50));
		
		Employee employee2 = new Employee(employeeId, name, salary);
		System.out.println(employee2.getEmployeeId());
		System.out.println(employee2.getName());
		System.out.println(employee2.getSalary());

	}

}
