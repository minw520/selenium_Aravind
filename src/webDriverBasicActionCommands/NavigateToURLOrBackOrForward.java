package webDriverBasicActionCommands;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class NavigateToURLOrBackOrForward {
 WebDriver driver = null;
 String localUrl= "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\";
 String localNewTestfile_001 = "file:///C:/Users/ermao/eclipse-Aravind/AravindSeleniumWebdriverpart_1_2/src/UrlFiles/abcd.html";
 
 
 
 @BeforeClass
 public void beforetest() {

  // set geckodriver path.
	 System.setProperty("webdriver.gecko.driver", localUrl +"geckodriver.exe");
 //To open Firefox browser
 driver = new FirefoxDriver();

 //To Maximize Browser Window
  driver.manage().window().maximize();

 //To Open URL In browser
 // driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
  driver.get(localNewTestfile_001);
  
 }
 
 @AfterClass
 public void aftertest() {
  driver.quit();
  
 }
 
 @Test
 public void test () throws InterruptedException 
 { 
  driver.navigate().to("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
  System.out.println("001");
  //To navigate back (Same as clicking on browser back button)
  driver.navigate().back();
  System.out.println("002");
  //To navigate forward (Same as clicking on browser forward button)
  driver.navigate().forward();
  System.out.println("003");
 }
   
}