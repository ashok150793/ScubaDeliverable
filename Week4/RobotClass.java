package com.scuba.training.Week5;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestLogin {

@Test
public void TestRobo() throws Exception{
System.setProperty("webdriver.gecko.driver","F:\\drivers\\geckodriver.exe");  
     WebDriver driver = new FirefoxDriver();
     // Maximize the window
     driver.manage().window().maximize();
     // Open facebook
     driver.get("http://www.facebook.com");
     // Enter Username
     //driver.findElement(By.id("email")).sendKeys("Selenium@gmail.com");
     driver.findElement(By.id("email")).sendKeys("xxxxabc@gmail.com");//Enter your Email
     // Enter password
     driver.findElement(By.id("pass")).sendKeys("xxx@12345");//Enter your password
     // Create object of Robot class
     Robot robot=new Robot();
	 
     // Press Enter
     robot.keyPress(KeyEvent.VK_ENTER);
     // Release Enter
     robot.keyRelease(KeyEvent.VK_ENTER);
	 
	 // SET THE MOUSE X Y POSITION
     robot.mouseMove(300, 650);
	 
	// Press Left button
	robot.mousePress(InputEvent.BUTTON1_MASK);
	// Release Left button
	robot.mouseRelease(InputEvent.BUTTON1_MASK);

	// Press Right button
	robot.mousePress(InputEvent.BUTTON3_MASK);
	// Release Right button
	robot.mouseRelease(InputEvent.BUTTON3_MASK);
	
	// Scroll MouseWheel
	robot.mouseWheel(5);

}
}