package LocatingWebElement;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ByLinkText { 
 
	WebDriver driver = null;
	  
	 //@BeforeMethod defines this method has to run before every @Test methods
	 @BeforeClass
	 public void openbrowser() { 
		  System.setProperty("webdriver.gecko.driver",
		             "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();

 //To Maximize Browser Window
  driver.manage().window().maximize();

 //To Open URL In browser
  driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
 }
 
 @AfterClass
 public void aftertest() {
 driver.quit();
  
 }
 
 @Test
 public void test() 
 {
  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  driver.findElement(By.linkText("Click Here")).click();//Locate element by linkText and then click on it.
  WebDriverWait wait = new WebDriverWait(driver, 15);
  wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("8:"))); //Locate element by partial linkText. 
 }

 }