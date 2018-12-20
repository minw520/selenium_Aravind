package openBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class openIEwithTestNG {
	WebDriver driver = null;
	  
	 //@BeforeMethod defines this method has to run before every @Test methods
	 @BeforeMethod
	 public void openbrowser() { 
	  System.setProperty("webdriver.ie.driver", "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\IEDriverServer.exe");
	  // Initialize InternetExplorerDriver Instance.
	   driver = new InternetExplorerDriver();
	 }

	 //@AfterMethod defines this method has to run after every @Test methods
	 @AfterMethod
	 public void closebrowser() {
	  System.out.print("\nBrowser close");
	  driver.quit();
	 }
	 
	 @Test
	 public void testmethodone() {
		 driver.get("http://only-testing-blog.blogspot.com/2014/04/calc.html");
		  // Execute sample calc test.
		  driver.findElement(By.xpath("//input[@id='1']")).click();
		  driver.findElement(By.xpath("//input[@id='plus']")).click();
		  driver.findElement(By.xpath("//input[@id='6']")).click();
		  driver.findElement(By.xpath("//input[@id='equals']")).click();
		  String result = driver.findElement(By.xpath("//input[@id='Resultbox']")).getAttribute("value");
		  System.out.println("Calc test result Is : " + result);
	 }
	
}
