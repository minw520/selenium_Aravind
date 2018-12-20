package OtherExample;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtractAllTextBox {
 WebDriver driver;
 
 @BeforeTest
 public void StartBrowser() {
	  System.setProperty("webdriver.gecko.driver",
	             "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\geckodriver.exe");
  driver = new FirefoxDriver();
 }
 
 @Test
 public void Text() throws InterruptedException{
  driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
  //find all input fields where type = text or password and store them In array list txtfields.
  List<WebElement> txtfields = driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
  
  //for loop to send text In all text box one by one.
  for(int a=0; a<txtfields.size();a++){   
   txtfields.get(a).sendKeys("Text"+(a+1));  
  }
  Thread.sleep(3000);
 }
 
 @AfterTest
 public void CloseBrowser() {  
  //driver.quit();  
 }
}
