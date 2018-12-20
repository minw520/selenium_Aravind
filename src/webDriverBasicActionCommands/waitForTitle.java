package webDriverBasicActionCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class waitForTitle {
 WebDriver driver = null;
 String localUrl= "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\";
 @BeforeClass
 public void beforetest() {
	 System.setProperty("webdriver.gecko.driver", localUrl +"geckodriver.exe");
  driver = new FirefoxDriver();
  driver.manage().window().maximize();
  driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 }
 
 @AfterClass
 public void aftertest() {
  //driver.quit();
  
 }
 
 @Test
 public void test () 
 {  
 driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("My Name");
 driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

 //Wait for page title
 WebDriverWait wait = new WebDriverWait(driver, 15);
 wait.until(ExpectedConditions.titleContains(": MyTest"));

 //Get and store page title in to variable
 String title = driver.getTitle();
 System.out.print(title);
 }

 }
