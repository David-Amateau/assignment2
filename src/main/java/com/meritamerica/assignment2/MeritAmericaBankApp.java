package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		System.out.println("Hello Merit America!");
		
		//Adds 5 CDOfferings to MeritBank
		
		MeritBank.getCDOfferings()[0] = new CDOffering(1, 1.8/100);
		MeritBank.getCDOfferings()[1] = new CDOffering(2,1.9/100);
		MeritBank.getCDOfferings()[2] = new CDOffering(3, 2.0/100);
		MeritBank.getCDOfferings()[3] = new CDOffering(5, 2.5/100);
		MeritBank.getCDOfferings()[4] = new CDOffering(10, 2.2/100);
		
		//instantiates a new account holder(ah1)
		AccountHolder ah1 = new AccountHolder("first", "middle", "last","SS", 0.0, 0.0);
		
		//Add a checking account with an opening balance of $1,000 as well as a savings account with an opening balance of $10,000 to ah1

		ah1.addCheckingAccount(1000.0);
		ah1.addSavingsAccount(10000.0);
		
		
		//Add a checking account with an opening balance of $5,000 as well as a savings account with an opening balance of $50,000 to ah1

		ah1.addCheckingAccount(5000.0);
		ah1.addSavingsAccount(50000.0);
		
		//Add a checking account with an opening balance of $50,000 as well as a savings account with an opening balance of $500,000 to ah1
		
		ah1.addCheckingAccount(50000.0);
		ah1.addSavingsAccount(500000.0);
		
		//Add a checking account with an opening balance of $5,000 as well as a savings account with an opening balance of $50,000 to ah1

		ah1.addCheckingAccount(5000.0);
		ah1.addSavingsAccount(50000.0);
		
//Confirm last checking and savings accounts were not created

//
		
		//Add the best CD offering as a CD account on ah1

		ah1.addCDAccount(MeritBank.getBestCDOffering(0), 0);
		
		//Add ah1 to Merit Bank’s list of account holders
		
		MeritBank.addAccountHolder(ah1);

		//Instantiate a new AccountHolder (ah2)
		
		AccountHolder ah2 = new AccountHolder ("first","middle", "last", "SS", 0.0, 0.0);

		
		//Add a checking account with an opening balance of $1,000 as well as a savings account with an opening balance of $10,000 to ah2

		ah2.addCheckingAccount(1000.0);
		ah2.addSavingsAccount(10000.0);
		
		//Add the second best CD offering as a CD account on ah2
		
		ah2.addCDAccount(MeritBank.getSecondBestCDOffering(0), 0);

		
		//Add ah2 to Merit Bank’s list of account holders

		MeritBank.addAccountHolder(ah2);
		
		//Clear the CDs being offered by MeritBank
		
		MeritBank.clearCDOfferings();
		
		//Instantiate a new AccountHolder (ah3)

		AccountHolder ah3 = new AccountHolder ("first", "middle", "last", "SS", 0.0, 0.0);
		
		//Add the second best CD offering as a CD account on ah3

		ah3.addCDAccount(MeritBank.getSecondBestCDOffering(0), 0);
		
		
//Confirm a CD account was not created on ah3
		
//
		
		
		//Add a checking account with an opening balance of $1,000 as well as a savings account with an opening balance of $10,000 to ah3

		ah3.addCheckingAccount(1000.0);
		ah3.addSavingsAccount(10000.0);
		
		//Add ah3 to Merit Bank’s list of account holders
		
		MeritBank.addAccountHolder(ah3);
		
		//Gets the total balance of all accounts held by Merit Bank’s account holders
		
		ah1.getCombinedBalance();
		ah2.getCombinedBalance();
		ah3.getCombinedBalance();
		


		


	}

	
}