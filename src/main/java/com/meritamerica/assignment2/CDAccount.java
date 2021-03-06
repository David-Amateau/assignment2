/*
 * FileName: CDAccount.java
 * 
 * This class stores information about Account Holders CD Accounts.
 * 
 */

package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount {
	
	/*  		Instance Variables			*/
	private double cdAccountBalance;
	private double cdAccountInterestRate;
	private int cdAccountTerm;
	private long cdAccountNumber;
	private double cdAccountFutureValue;
	
	
	/*			Instance Objects			*/
	CDOffering cdOffering;
	// date for get date??????
	
	// This is the constructor for CDAccount
	public CDAccount(CDOffering offering, double balance) {
		// I'm not sure about this super constructor
		// need to trace its path and understand whats going on
		// and what is coming in better
		super(balance, offering.getInterestRate());
		cdOffering = offering; // This contains the term and interest rate
		// but how do i get it into a variable for the getInterestRate method
		cdAccountBalance = balance;
		// Do other things need to be in this constructor??
	}
	
	// This method will return the balance
	public double getBalance() {
		return cdAccountBalance;
	}
	
	// This method will return the Interest Rate
	public double getInterestRate() {
		cdAccountInterestRate = cdOffering.getInterestRate();
		return cdAccountInterestRate;
	}
	
	// This method will return the term
	public int getTerm() {
		cdAccountTerm = cdOffering.getTerm();
		return cdAccountTerm;
	}
	
	// This method will return the date the CD Account was created
	java.util.Date getStartDate() {
		
	}
	
	// This method will return the account number by getting it from its
	// super class which is BankAccount
	public long getAccountNumber() {
		cdAccountNumber = super.getAccountNumber();
		return cdAccountNumber;
	}
	
	// This method will calculate and return the Future Value of the CD
	// Is this method supposed to take in a parameter 'years' or is years
	// determined by which cdOffering they choose
	public double futureValue() {
		cdAccountFutureValue = 
		return cdAccountFutureValue;
	}
}
