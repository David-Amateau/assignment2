package com.meritamerica.assignment2;

public class CDOffering {
	/*
	 * Instance Variables
	 */
	
	private int term;
	private double interestRate;
	
	
	// This is the constructor for CDOffering
	public CDOffering(int term, double interestRate) {
		this.term = term;
		this.interestRate = interestRate;
	}
	
	// This method will return the Term
	public int getTerm() {
		return term;
	}
	
	// This method will return the Interest Rate
	double getInterestRate() {
		return interestRate;
	}

}
