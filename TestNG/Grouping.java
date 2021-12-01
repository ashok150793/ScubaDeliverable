package com.scuba.testng;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = "Accounts")
	public void SampleAccount() {
		
		System.out.println("List of Accounts");
		
	}
	
	@Test(groups = "Creditcards")
	public void CreditCardList() {
		
		System.out.println("List of Credit cards");
		
	}
	
	@Test(groups = "Loans")
	public void LoanList() {
		
		System.out.println("List of Loans");
		
	}
	
		
}
