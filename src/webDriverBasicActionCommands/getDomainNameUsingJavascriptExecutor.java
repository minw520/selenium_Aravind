package webDriverBasicActionCommands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class getDomainNameUsingJavascriptExecutor {
 WebDriver driver = null;
 String localUrl= "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\";
String localNewTestfile_001 = "file:///C:/Users/ermao/eclipse-Aravind/AravindSeleniumWebdriverpart_1_2/src/UrlFiles/abcd.html";
 
 
 @BeforeClass
 public void beforetest() {
	 System.setProperty("webdriver.gecko.driver", localUrl +"geckodriver.exe");
  driver = new FirefoxDriver();
  driver.manage().window().maximize();
  driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
  //driver.get(localNewTestfile_001);   //document.domain make sence when Url is on internet
  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 }
 
 @AfterClass
 public void aftertest() {
  driver.quit();
  
 }
 
 @Test
 public void test () 
 {  
  String CurrentURL = driver.getCurrentUrl();
  System.out.println("My Current URL Is  : "+CurrentURL);
  
  //Get and store domain name in variable
  JavascriptExecutor javascript = (JavascriptExecutor) driver;
  String DomainUsingJS=(String)javascript.executeScript("return document.domain");  
  System.out.println("My Current URL Is  : "+DomainUsingJS);
 }
 }
