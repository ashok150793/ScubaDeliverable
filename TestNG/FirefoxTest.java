import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirefoxTest {

	public WebDriver driver; 
	@BeforeTest
	public void beforeTest() {
		System.out.println("Initilizing the Google Chrome Driver");
		driver = new FirefoxDriver();
	}
        @Test
 	public void FirefoxTestMethod()
 	{ 

	  //Initialize the chrome driver
	 System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
	 driver.get("https://www.amazon.com"); 
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
 
    }
 
     @AfterTest
     public void afterTest() {
	 System.out.println("Closing the browser ");
	 driver.close();
     }
}