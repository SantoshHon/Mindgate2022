package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class AccountApplicationMainv3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accountNumber;
		String name;
		double balance;
		int trasactionChoice;
		double amount;
		boolean result;
		String userChoice;

		System.out.println("Welcome to XYZ Bank");

		System.out.println("Enter account Number");
		accountNumber = scanner.nextInt();
		System.out.println("Enter Name");
		name = scanner.next();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		Account account = new Account(accountNumber, name, balance);
		System.out.println("Account open Successfully");
		System.out.println();
		do {
			System.out.println("Menu");
			System.out.println("1. Withdraw 2.Deposite 3. Check Balance");
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
