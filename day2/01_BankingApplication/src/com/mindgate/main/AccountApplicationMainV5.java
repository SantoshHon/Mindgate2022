package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Savings;

public class AccountApplicationMainV5 {
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);
	int accountNumber;
	String name;
	double balance;
	int trasactionChoice;
	double amount;
	boolean result;
	String userChoice;
	boolean isSalary;

	System.out.println("Welcome to XYZ Bank");

	System.out.println("Enter account Number");
	accountNumber = scanner.nextInt();
	System.out.println("Enter Name");
	name = scanner.next();
	System.out.println("Enter Balance");
	balance = scanner.nextDouble();
	System.out.println("Do you Want to open salary account?true or false");
	isSalary=scanner.nextBoolean();

	Account account = new Savings(accountNumber, name, balance, isSalary);
	System.out.println("Account open Successfully");
	System.out.println();
	do {
		System.out.println("Menu\n 1. Withdraw\n 2. Deposite\n 3. Check Balance");
		trasactionChoice = scanner.nextInt();

		switch (trasactionChoice) {
		case 1:
			System.out.println("Enter amount to be withdrow");
			amount = scanner.nextDouble();
			result = account.withdraw(amount);
			if (result) {
				System.out.println("trasaction succsessfully");
				System.out.println("Balance:: " + account.getBalance());
			} else {
				System.out.println("trasaction failed");
				System.out.println("Balance:: " + account.getBalance());
			}

			break;

		case 2:
			System.out.println("Enter amount to be deposite");
			amount = scanner.nextDouble();
			result = account.deposite(amount);
			if (amount > 0) {
				System.out.println("Deposite succsessfully");
				System.out.println("Balance:: " + account.getBalance());
			} else {
				System.out.println("Deposite failed");
				System.out.println("Balance:: " + account.getBalance());
			}

			break;

		case 3:
			System.out.println("Balance:" + account.getBalance());
			break;

		default:
			System.out.println("invalid choice");
			break;

		}
		System.out.println("Do you Want continue");
		userChoice = scanner.next();

	} while (userChoice.equals("yes"));
	System.out.println("Thank you for banking with us");

}

}
