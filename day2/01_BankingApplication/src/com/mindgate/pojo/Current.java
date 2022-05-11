package com.mindgate.pojo;

public class Current extends Account {
	private double overdraftBalance;

	public Current() {
		System.out.println("Default constructor of current");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		System.out.println("Overloaded Constructor of current");
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
			return true;
		}
		if (amount > getBalance()) {
			
			setOverdraftBalance((getOverdraftBalance() + getBalance()) - amount);
			setBalance(0);
			return true;
		}
		return false;
	} 
	@Override
	public boolean deposite(double amount) {
	
	if(amount+getOverdraftBalance()<=50000)
	{
		setOverdraftBalance(getOverdraftBalance()+amount);
	}
		
	else
	{ double a=50000-getOverdraftBalance();
		setOverdraftBalance(50000);
 		setBalance(amount-a);
	}
		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}

}
