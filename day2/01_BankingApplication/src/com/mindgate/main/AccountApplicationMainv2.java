package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountApplicationMainv2 {

	public static void main(String[] args) {

		Account account = new Account(101, "Santosh Honrao", 1000);
		boolean result = account.withdraw(2000);
		if (result) {
			System.out.println("Transation complited successfully");
			System.out.println("Balance::" + account.getBalance());
		} else {
			System.out.println("Trasaction Failed");
			System.out.println("Balance::" + account.getBalance());
		}
		System.out.println("-".repeat(50));
		result = account.deposite(1000);
		if (result) {
			System.out.println("Transaction complited successfully");
			System.out.println("Balance :: " + account.getBalance());

		}

	}

}
