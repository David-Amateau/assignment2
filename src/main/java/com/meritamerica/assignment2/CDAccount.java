package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount {
	
	/*  		Instance Variables			*/
	private double cdAccountBalance;
	private double cdAccountInterestRate;
	private int cdAccountTerm;
	private long cdAccountNumber;
	private double cdAccountFutureValue;
	// date for get date??????
	
	
	
	// This is the constructor for CDAccount
	public CDAccount(CDOffering offering, double balance) {
		
	}
	
	// This method will return the balance
	public double getBalance() {
		return cdAccountBalance;
	}
	
	// This method will return the Interest Rate
	public double getInterestRate() {
		return cdAccountInterestRate;
	}
	
	// This method will return the term
	public int getTerm() {
		return cdAccountTerm;
	}
	
	// This method will return the date the CD Account was created
	java.util.Date getStartDate() {
		
	}
	
	// This method will return the account number
	public long getAccountNumber() {
		return cdAccountNumber;
	}
	
	// This method will calculate and return the Future Value of the CD
	public double futureValue() {
		
	}
}
