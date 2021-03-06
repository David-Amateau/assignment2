/*
 * FileName: BankAccount.java
 * 
 * This class stores information about Account Holders Bank Accounts.
 * 
 */

package com.meritamerica.assignment2;

public class BankAccount {
	
	/*  		Instance Variables			*/
	private double bankAccountBalance;
	private double bankAccountInterestRate;
	private double bankAccountFutureValue;
	private long accountNumber;
	
	// This is a Super Constructor for the BankAccount class
	public BankAccount(double balance, double interestRate) {
		bankAccountBalance = balance;
		bankAccountInterestRate = interestRate;
		// do we call the constructor below to add a bank account number to each
		// bank account??????????
		BankAccount(accountNumber, balance, interestRate);
	}
	
	// This is also a Super Constructor for the BankAccount class
	public BankAccount(long accountNumber, double balance, double interestRate) {
		this.accountNumber = accountNumber;
		bankAccountBalance = balance;
		bankAccountInterestRate = interestRate;
	}
	
	// This method will return the Bank Account Number
	public long getAccountNumber() {
		return accountNumber;
	}
	
	// This method will return the Bank Account Balance
	public double getBalance() {
		return bankAccountBalance;
	}
	
	// This method will return the Bank Account Interest Rate
	public double getInterestRate() {
		return bankAccountInterestRate;
	}
	
	// This method will withdraw money from the Bank Account if the amount
	// withdrawn is less then the balance of the account
	public boolean withdraw(double amount) {
		if (amount > bankAccountBalance) {
			System.out.println("Insufficent Funds");
			return false;
		} else {
			bankAccountBalance -= amount;
			System.out.println("Your new balance is $" + bankAccountBalance + "\n");
			return true;
		}
	}
	
	// This method will deposit money into the Bank Account if the amount
	// is a positive number
	public boolean deposit(double amount) {
		if (amount > 0) {
			bankAccountBalance += amount;
			System.out.println("Your new balance is $" + bankAccountBalance + "\n");
			return true;
		} else {
			System.out.println("Your deposit has failed. Please try again.\n");
			return false;
		}
	}
	
	// This method will determine the future value of the Bank Account
	public double futureValue(int years) {
		bankAccountFutureValue = bankAccountBalance * 
				(Math.pow(1 + bankAccountInterestRate, years));
		return bankAccountFutureValue;
	}
}
