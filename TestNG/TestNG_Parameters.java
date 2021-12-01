package com.scuba.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters {
	
	@BeforeClass
	@Parameters({"browser"})
	public void setUp(String browser) {
If (browser=="chrome"){
System.out.println("Initilizing the Google Chrome Driver");
		driver = new ChromeDriver();
}
			}
	
	@Test
	@Parameters({"url"})
	public void LaunchUrl(String url) {
	  driver.get(url); 
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	}
}