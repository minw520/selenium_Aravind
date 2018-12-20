package Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class waitForAlert {
 WebDriver driver = null;
 
 @BeforeClass
 public void beforetest() {
	  System.setProperty("webdriver.gecko.driver",
			    "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\geckodriver.exe");
			  driver = new FirefoxDriver();
			  driver.manage().window().maximize();
  driver.get("http://only-testing-blog.blogspot.in/2014/01/new-testing.html");
 }
 
 @AfterClass
 public void aftertest() {
 driver.quit();
  
 }
 
 @Test
 public void test () 
  {  
  driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("My Name");
  WebDriverWait wait = new WebDriverWait(driver, 15);
  wait.until(ExpectedConditions.alertIsPresent());
  String alrt = driver.switchTo().alert().getText();
  System.out.print(alrt);
  }
 
 
 
 }
