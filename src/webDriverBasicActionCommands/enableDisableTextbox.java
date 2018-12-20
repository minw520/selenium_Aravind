package webDriverBasicActionCommands;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import jxl.read.biff.BiffException;

public class enableDisableTextbox {
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
 public void test () throws BiffException, IOException, InterruptedException 
 {
 boolean fbefore = driver.findElement(By.xpath("//input[@name='fname']")).isEnabled();
 System.out.print("\nBefore : First Name Text box enabled status is : "+fbefore);
 boolean lbefore = driver.findElement(By.xpath("//input[@name='lname']")).isEnabled();
 System.out.print("\nBefore : Last Name Text box enabled status is : "+lbefore);
 
 Thread.sleep(2000);
 
 //To disable First Name text box
 JavascriptExecutor javascript = (JavascriptExecutor) driver;
 String todisable = "document.getElementsByName('fname')[0].setAttribute('disabled', '');";
 javascript.executeScript(todisable);
 Thread.sleep(2000);
 
 //To enable Last Name text box
 String toenable = "document.getElementsByName('lname')[0].removeAttribute('disabled');";
 javascript.executeScript(toenable);
 Thread.sleep(3000);
 
 
 boolean fafter = driver.findElement(By.xpath("//input[@name='fname']")).isEnabled();
 System.out.print("\nAfter : First Name Text box enabled status is : "+fafter);
 boolean lafter = driver.findElement(By.xpath("//input[@name='lname']")).isEnabled();
 System.out.print("\nAfter : Last Name Text box enabled status is : "+lafter);
   
 }
 }
