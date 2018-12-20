package webDriverBasicActionCommands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ExecutingJavascript {
 WebDriver driver = null;
 String localUrl= "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\";
 String localNewTestfile_001 = "file:///C:/Users/ermao/eclipse-Aravind/AravindSeleniumWebdriverpart_1_2/src/UrlFiles/abcd.html";
 
 
 @BeforeClass
 public void beforetest() {
	 System.setProperty("webdriver.gecko.driver", localUrl +"geckodriver.exe");
  driver = new FirefoxDriver();
  driver.manage().window().maximize();
  //driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
  driver.get(localNewTestfile_001);
  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 }
 
 @AfterClass
 public void aftertest() {
  //driver.quit();
  
 }
 
 @Test
 public void test () 
 {  
  JavascriptExecutor javascript = (JavascriptExecutor) driver;
    
  //Get current page title
  String pagetitle=(String)javascript.executeScript("return document.title");  
  System.out.println("My Page Title Is  : "+pagetitle);
  
  //Get current page URL
  String CurrentURL = driver.getCurrentUrl();
  System.out.println("My Current URL Is  : "+CurrentURL);
 }
}
