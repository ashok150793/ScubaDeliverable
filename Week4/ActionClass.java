package com.scuba.training.Week5;
 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
 
public class ActionClass {
 
@Test
public void TestAction() throws Exception{
	System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");  
    WebDriver driver = new FirefoxDriver();
    // Maximize the window
    driver.manage().window().maximize();
	driver.get(""http://www.facebook.com"");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(3000);
	
	Actions builder = new Actions(driver);
	builder.moveToElement(driver.findElement(By.id("header_topcat"))).build().perform();
	Thread.sleep(3000);
	
	WebElement link = driver.findElement(By.cssSelector("#software-testing-certification-courses"));
	builder.moveToElement(link).build().perform();
	Thread.sleep(2000);
	
	WebElement search = driver.findElement(By.xpath("//span[@class='typeahead__button']"));
	builder.moveToElement(search).build().perform();
	Thread.sleep(3000);
	
	//Perform Series of Action
	Action seriesOfActions;
	seriesOfActions = builder
	.sendKeys(act, "Selenium")
	.keyDown(search, Keys.SHIFT)
	.keyUp(search, Keys.SHIFT)
	.build();
	seriesOfActions.perform();
	Thread.sleep(3000);
	
	//Drag and Drop an Element
	WebElement SourceElement= driver.findElement(By.id("draggable"));
	WebElement TargetElement= driver.findElement(By.id("droppable"));
	Actions action = new Actions(driver);
	Thread.sleep(3000);
	action.dragAndDrop(SourceElement, TargetElement).build().perform();
	//action.clickAndHold(SourceElement).moveToElement(TargetElement).release().build().perform();
	Thread.sleep(3000);
	driver.quit();
}
 
}