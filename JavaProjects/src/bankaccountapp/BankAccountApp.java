package bankaccountapp;

import java.util.List;

public class BankAccountApp {
	public static void main(String[] args) {
		String file = "C:\\Users\\User\\Desktop\\NewBankAccounts.csv";
		
		
		
		/*
		Checking chkacc1 = new Checking("Tom Wilson","321456879",1500);
		Savings savacc1 = new Savings("Rich Love","456657897",2500);
		
		
		savacc1.showInfo();
		System.out.println("*****************");
		chkacc1.showInfo();
		*/
	
		List<String[]> newAccountHolder = utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolders) {
			System.out.println("NEW ACCOUNT");
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = accountHolder[3];
			System.out.println(name + " " + sSN + " " + " " + accountType + " " + initDeposit);
			System.out.println(accountHolder[0]);
			System.out.println(accountHolder[1]);
			System.out.println(accountHolder[2]);
			System.out.println(accountHolder[3]);
		}
	}
}
