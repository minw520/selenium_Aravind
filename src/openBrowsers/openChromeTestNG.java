package openBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class openChromeTestNG {

	WebDriver driver = null;
	  
	 //@BeforeMethod defines this method has to run before every @Test methods
	 @BeforeMethod
	 public void openbrowser() { 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.google.com");
	 }

	 //@AfterMethod defines this method has to run after every @Test methods
	 @AfterMethod
	 public void closebrowser() {
	  System.out.print("\nBrowser close");
	  driver.quit();
	 }
	 
	 @Test
	 public void testmethodone() {
		 if (driver.findElement(By.xpath("//input[@name='q']")).isEnabled()) {
			   System.out.println("Google search text box Is enabled.");
			   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("WebDriver Test successful.");
			   System.out.println("001");
			   //driver.findElement(By.xpath("//button[@name='btnG']")).click();
			   driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
			   System.out.println("002");
			   System.out.println("Google search completed.");
			  } else {
			   System.out.println("Google search test box Is Not enabled.");

			  }
	 }
	
}
 
