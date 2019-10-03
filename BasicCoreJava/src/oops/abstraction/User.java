package oops.abstraction;

public class User {

	public static void main(String[] args) 
	{
		RBI acc;
		
		acc = new PNB();
		acc.savingAccount();
		acc.currentAccount();
		acc.debitCard();
		acc.creditCard();
		acc.demonetization();
		SupremeCourt.constitutionalRights();
		
		
		
		System.out.println();
		
		
		acc = new Canara();
		acc.savingAccount();
		acc.currentAccount();
		acc.debitCard();
		acc.creditCard();
		acc.demonetization();
		
		System.out.println();

		acc = new SBI();
		acc.savingAccount();
		acc.currentAccount();
		acc.debitCard();
		acc.creditCard();

		

	}
	
	

}
