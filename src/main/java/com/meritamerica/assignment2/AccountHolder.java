package com.meritamerica.assignment2;

public class AccountHolder {
	
	/*  		Instance Variables			*/
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
	
	/*  		Instance Objects			*/
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
	
	// This method will return an array of the checking accounts of a an Account Holder
	public CheckingAccount[] getCheckingAccounts() {
		
	}
	
	// This method will return the number of checking accounts an Account Holder has
	public int getNumberOfCheckingAccounts() {
		
	}
	
	// This method will return the balance of an Account Holder's Checking Accounts
	public double getCheckingBalance() {
		
	}
	
	public SavingsAccount addSavingsAccount(double openingBalance) {
		
	}
	
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		
	}
	
	// This method will return an array of an Account Holder's Savings Accounts
	public SavingsAccount[] getSavingsAccounts() {
		
	}
	
	// This method will return the number of Savings Accounts an Account Holder has
	public int getNumberOfSavingsAccounts() {
		
	}
	
	// This method will return the balance of an Account Holder's Savings Accounts
	public double getSavingsBalance() {
		
	}
	
	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		
	}
	
	public CDAccount addCDAccount(CDAccount cdAccount) {
		
	}
	
	// This method will returnn an array of an Account Holder's CD Accounts
	public CDAccount[] getCDAccounts() {
		
	}
	
	// This method will return the number of CD Accounts an Account Holder has
	public int getNumberOfCDAccounts() {
		
	}
	
	// This method will return the balance of an Account Holder's CD Accounts
	public double getCDBalance() {
		
	}
	
	// This method will return the combined balance of all acounts of an Account Holder??
	public double getCombinedBalance() {
		
	}
	
	// This method will print out all the information of an Account Holder
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