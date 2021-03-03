package com.meritamerica.assignment2;

import java.util.Arrays;
/*
 * This class will be used to create objects of type AccountHolder
 * and set and retrieve information about the AccountHolder.
 * It will also create for each AccountHolder a Checking Account and
 * a Savings Account object.
 */

public class AccountHolder {
	
	/* 
	 * 		Instance Variables
	 */
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
	
	/*
	 * 		Instance Objects
	 */
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;
	
	
	/*
	 *  This constructor will be called if no parameters are passed when an
	 *  an AccountHolder is created.
	 */
	public AccountHolder() {
	}
	
	/*
	 * This constructor will be called if all parameters are sent in their
	 * correct order when a new Account Holder is created.
	 */
	public AccountHolder(String firstName, String middleName, String lastName, String ssn, 
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
		this.checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		this.savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);
	}
	
	// This method will return the Account Holder's First Name
	public String getFirstName() {
		return firstName;
	}
	
	// This method will set the Account Holder's First Name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// This method will return the Account Holder's Middle Name
	public String getMiddleName() {
		return middleName;
	}
	
	// This method will set the Account Holder's Middle Name
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	// This method will return the Account Holder's Last Name
	public String getLastName() {
		return lastName;
	}
	
	// This method will set the Account Holder's Last Name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// This method will return the Account Holder's SSN
	public String getSSN() {
		return ssn;
	}
	
	// This method will set the Account Holder's SSN
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	// New Methods and ones that need to be modified
	public CheckingAccount addCheckingAccount(double openingBalance) {
		
	}
	
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		
	}
	
	
	public CheckingAccount[] getCheckingAccounts() {
		
	}
	
	public int getNumberOfCheckingAccounts() {
		
	}
	
	public double getCheckingBalance() {
		
	}
	
	public SavingsAccount addSavingsAccount(double openingBalance) {
		
	}
	
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		
	}
	
	public SavingsAccount[] getSavingsAccounts() {
		
	}
	
	public int getNumberOfSavingsAccounts() {
		
	}
	
	public double getSavingsBalance() {
		
	}
	
	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		
	}
	
	public CDAccount addCDAccount(CDAccount cdAccount) {
		
	}
	
	public CDAccount[] getCDAccounts() {
		
	}
	
	public int getNumberOfCDAccounts() {
		
	}
	
	public double getCDBalance() {
		
	}
	
	public double getCombinedBalance() {
		
	}
	
	// This method will print out all the information of an Account Holder
	// All the Print Statements need quite a bit of work
	@Override
	public String toString() {
		String accountHolderInfo = "Name: " + getFirstName() + " " + getMiddleName()
				+ " " + getLastName() +
				"\nSSN: " + getSSN() + "\n" +
				checkingAccount.toString() + "\n" +
				savingsAccount.toString();
		
		return accountHolderInfo;
	}
}