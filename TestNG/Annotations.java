package com.scuba.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Annotations {
  @Test
  public void Updateprofile() {
	  System.out.println("Profile has been updated successfully");
  }
  @BeforeMethod
  public void AccountLogin() {
	  System.out.println(" Account Login is successfull");
  }

  @AfterMethod
  public void AccountLogout() {
	  System.out.println(" Account has been logged out");
  }

  @BeforeTest
  public void Openbrowser() {
	  System.out.println("Chrome browser is opened");
  }

  @AfterTest
  public void CloseBrowser() {
	  System.out.println("Chrome browser is closed");	  
  }

}
