package com.scuba.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	@DataProvider(name="inputs")
	public Object[][] getData() {
		return new Object[][] {
			{"Animal", "lion"},
			{"Bird", "Parrot"},
			{"Tree", "Neem"}
		};
	}
	
	@Test(dataProvider="inputs")
	public void testMethod1(String input1, String input2) {
		System.out.println("Input 1: " + input1);
		System.out.println("Input 2: " + input2);
	}
}