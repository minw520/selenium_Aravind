package webDriverBasicActionCommands;

import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.net.BindException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class verifyElementEnabledOrDisabled {
 WebDriver driver = null;
 String localUrl= "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\";
 String localNewTestfile_001 = "file:///C:/Users/ermao/eclipse-Aravind/AravindSeleniumWebdriverpart_1_2/src/UrlFiles/abcdi.html";
 
 
 
 @BeforeClass
 public void beforetest() {

  // set geckodriver path.
	 System.setProperty("webdriver.gecko.driver", localUrl +"geckodriver.exe");
 //To open Firefox browser
 driver = new FirefoxDriver();

  //driver.get("http://only-testing-blog.blogspot.in/p/mouse-hover.html");
 driver.get(localNewTestfile_001);
  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 }
 
 @AfterClass
 public void aftertest() {
  driver.quit();
  
 }
 
 @Test
 public void test () throws BindException, IOException, InterruptedException 
 {
 boolean fname = driver.findElement(By.xpath("//input[@name='fname']")).isEnabled();
 System.out.print(fname);
 
 WebElement firstname = driver.findElement(By.xpath("//input[@name='fname']"));
 WebElement lastname = driver.findElement(By.xpath("//input[@name='lname']"));
 
 //Verify First name text box is enabled or not and then print related message.
 if(firstname.isEnabled())
 {
  System.out.print("\nText box First name is enabled. Take your action.");
 }
 else
 {
  System.out.print("\nText box First name is disabled. Take your action.");
 }
 
 //Verify Last name text box is enabled or not and then print related message.
 if(lastname.isEnabled())
 {
  System.out.print("\nText box Last name is enabled. Take your action.");
 }
 else
 {
  System.out.print("\nText box Last name is disabled. Take your action.");
 }
 }
 }