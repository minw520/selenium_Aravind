package LocatingWebElement;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class byByTagName { 
 
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
 //Locating element by tagName and store its text in to variable dropdown.
  String dropdown = driver.findElement(By.tagName("select")).getText();
  System.out.print("Drop down list values are as bellow :\n"+dropdown);
 }

 
 }