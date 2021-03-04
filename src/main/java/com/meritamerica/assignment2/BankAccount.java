package com.meritamerica.assignment2;

public class BankAccount {
	
	/*  		Instance Variables			*/
	private double balance;
	private double interestRate;
	private long accountNumber;
	private double FutureValue;
	
	
	
	
	
	// This is a Constructor for the BankAccount class
	public BankAccount(double balance, double interestRate) {
		
	}
	
	// This is also a Constructor for the BankAccount class
	public BankAccount(long accountNumber, double balance, double interestRate) {
		
	}
	
	// This method will return the Bank Account Number
	public long getAccountNumber() {
		return accountNumber ;
		
	}
	
	// This method will return the Bank Account Balance
	public double getBalance() {
		return balance ;
		
	}
	
	// This method will return the Bank Account Interest Rate
	public double getInterestRate() {
		return interestRate ;
		
	}
	
	// This method will withdraw money from the Bank Account if the amount
	// withdrawn is less then the balance of the account
	public boolean withdraw(double amount) {
		if (balance <= 0 || amount > balance) {
			System.out.println("Insufficient Funds /n");
			return false;
		
		} else {
			balance = balance - amount;
			return true;
			
		} 
			
		
	}
	
	// This method will deposit money into the Bank Account if the amount
	// is a positive number
	public boolean deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			return true;
 		} else { System.out.println("System Error");
 			return false;
 		}
		
	}
	
	// This method will determine the future value of the Bank Account
	public double futureValue(int years) {
		FutureValue = balance * 
				(Math.pow(1 + interestRate, years));
		return FutureValue;
		 
		
	}
}
