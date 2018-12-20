package webDriverBasicActionCommands;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class waitTillElementVisibleOrAppearOrPresentOnPage {
 WebDriver driver = null;
 String localUrl= "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\";
 String localNewTestfile_001 = "file:///C:/Users/ermao/eclipse-Aravind/AravindSeleniumWebdriverpart_1_2/src/UrlFiles/abcdf.html";
 
 @BeforeClass
 public void beforetest() {
	 System.setProperty("webdriver.gecko.driver", localUrl +"geckodriver.exe");
  driver = new FirefoxDriver();
  driver.manage().window().maximize();
  //driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
  // driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
  //driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
  driver.get(localNewTestfile_001);
 }
 
 @AfterClass
 public void aftertest() {
  //driver.quit();
  
 }
 
 @Test
 public void test () throws InterruptedException, IOException 
 {   
  //To wait for element visible
  WebDriverWait wait = new WebDriverWait(driver, 15);
  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='text3']")));
  
  driver.findElement(By.xpath("//input[@id='text3']")).sendKeys("Text box is visible now");
  System.out.print("Text box text3 is now visible");
    
 }
   
}