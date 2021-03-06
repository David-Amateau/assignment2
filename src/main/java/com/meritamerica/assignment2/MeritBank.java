/*
 * FileName: MeritBank.java
 * 
 * This class stores information about Merit Bank.
 * 
 */

package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random; // for account numbers

public class MeritBank {
	
	/*  		Instance Variables			*/
	private double totalBalance;
	private int numOfAccountHolders;
	
	/* 			Instance Arrays				*/
	private static AccountHolder[] accountHoldersArray = new AccountHolder[100];
	private static CDOffering[] cdOfferingsArray = new CDOffering[5];
	
	
	// This method will create an Account Holder??
	static void addAccountHolder(AccountHolder accountHolder) {
		// This method should also add the account holder to the array of
		// account holders
	}
	
	// This method will return an array of all Account Holders of Merit Bank
	public static AccountHolder[] getAccountHolders() {
		return accountHoldersArray;
	}
	
	// This method will return an array of all CD Offerings offered by Merit Bank
	public static CDOffering[] getCDOfferings() {
		return cdOfferingsArray;
	}
	
	// This method will return the CD Offering with the highest calculated
	// future value offered by Merit Bank
	public static CDOffering getBestCDOffering(double depositAmount) {
		
	}
	
	// This method will return the CD Offering with the second highest calculated
	// future value offered by Merit Bank
	public static CDOffering getSecondBestCDOffering(double depositAmount) {
		
	}
	
	// This method will clear all CD Offerings offered by Merit Bank?????
	public static void clearCDOfferings() {
		
	}
	
	// This method will do something????
	public static void setCDOfferings(CDOffering[] offerings) {
		
	}
	
	// This method will start at some number and increase that number by 1??
	// every time an account is created with Merit Bank
	public static long getNextAccountNumber() {
		// Do we get a random number or start at some number and increase by 1
		// every time we call this method
	}
	
	// This method will return the total balances of all Account Holders of Merit Bank???
	// or of an account holder?
	public static double totalBalances() {
		totalBalance += 
		
		
		return totalBalance;
	}
	
	// This method will return the future value of Merit Bank???
	public static double futureValue(double presentValue, double interestRate, int term) {
		
	}
}
