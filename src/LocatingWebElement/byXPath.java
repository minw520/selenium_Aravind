package LocatingWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class byXPath { 
 
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
 //driver.quit();
  
 }
 
 @Test
 public void test() 
 {
  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/form[1]/input[1]")).sendKeys("My Name");
  //driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("My Name");
  //Locate element by cssSelector and then type the text in it.
 }

}