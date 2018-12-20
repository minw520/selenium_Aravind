package TestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class getDriverTitle {
 
 WebDriver driver = null;
  
 //@BeforeMethod defines this method has to run before every @Test methods
 @BeforeMethod
 public void openbrowser() { 
	  System.setProperty("webdriver.gecko.driver",
	  "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\geckodriver.exe");
	  driver = new FirefoxDriver();
  driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
 }

 //@AfterMethod defines this method has to run after every @Test methods
 @AfterMethod
 public void closebrowser() {
  System.out.print("\nBrowser close");
  driver.quit();
 }
 
 @Test
 public void testmethodone() {
   String title = driver.getTitle();
   System.out.print("Current page title is : "+title);
   System.out.print("\n'TestNGOne -> TestNGOnePack -> ClassOne -> testmethodone' has been executed successfully");
 }
}
