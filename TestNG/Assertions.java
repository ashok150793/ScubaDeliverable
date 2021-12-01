package com.scuba.testng;

import org.testng.Assert;  
import org.testng.annotations.Test;  

public class Assertions   
{  
@Test  
public void assertTruedemo()  

{  
Assert.assertTrue(false);  
}  

@Test  
public void assertFalsedemo()  
{  
Assert.assertFalse(false);  
}
@Test  
public void assertEqualsdemo()  
{ 
String ActualTitle = “Welcome to Amazon”;
String ExpectedTitle = “Welcome to Amazon”;
Assert.assertEquals(ActualTitle, ExpectedTitle);
}
@Test  
public void assertNotEqualsdemo()  
{ 
String ActualTitle = “Welcome to Flipkart”;
String ExpectedTitle = “Welcome to Amazon”;
Assert.assertNotEquals(ActualTitle, ExpectedTitle);
}

  
}  