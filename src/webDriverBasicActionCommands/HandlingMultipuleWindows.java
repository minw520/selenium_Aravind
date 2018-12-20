package webDriverBasicActionCommands;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class HandlingMultipuleWindows {
 WebDriver driver = null;
 String localUrl= "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\";
 String localNewTestfile_001 = "file:///C:/Users/ermao/eclipse-Aravind/AravindSeleniumWebdriverpart_1_2/src/UrlFiles/abcdh.html";
 
  
 @BeforeClass
 public void beforetest() {
  // set geckodriver path.
	System.setProperty("webdriver.gecko.driver", localUrl +"geckodriver.exe");
 //To open Firefox browser
	driver = new FirefoxDriver();

  //driver.get("http://only-testing-blog.blogspot.in/p/mouse-hover.html");
	driver.get(localNewTestfile_001);
  //driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
 }
 
 @AfterClass
 public void aftertest() {
  driver.quit();
  
 }
 
 @Test

 public void test () throws InterruptedException 
 {
 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 driver.findElement(By.xpath("//b[contains(.,'Open New Page')]")).click();  // http://only-testing-blog.blogspot.com/2013/09/test.html
 
 // Get and store both window handles in array
 Set<String> AllWindowHandles = driver.getWindowHandles();
 String window1 = (String) AllWindowHandles.toArray()[0];
 System.out.print("window1 handle code = "+AllWindowHandles.toArray()[0]);
 String window2 = (String) AllWindowHandles.toArray()[1];
 System.out.print("\nwindow2 handle code = "+AllWindowHandles.toArray()[1]);
 
 //Switch to window2(child window) and performing actions on it.
 driver.switchTo().window(window2);
 driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("My Name");
 driver.findElement(By.xpath("//input[@value='Bike']")).click();
 driver.findElement(By.xpath("//input[@value='Car']")).click();
 driver.findElement(By.xpath("//input[@value='Boat']")).click();
 driver.findElement(By.xpath("//input[@value='male']")).click();
 Thread.sleep(5000);
 
 //Switch to window1(parent window) and performing actions on it.
 driver.switchTo().window(window1);
 driver.findElement(By.xpath("//option[@id='country6']")).click();
 driver.findElement(By.xpath("//input[@value='female']")).click();
 driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
 driver.switchTo().alert().accept();
 Thread.sleep(5000);
 
 //Once Again switch to window2(child window) and performing actions on it.
 driver.switchTo().window(window2);
 driver.findElement(By.xpath("//input[@name='fname']")).clear();
 driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Name Changed");
 Thread.sleep(5000);
 driver.close();
 
 
 //Once Again switch to window1(parent window) and performing actions on it.
 driver.switchTo().window(window1);
 driver.findElement(By.xpath("//input[@value='male']")).click();
 Thread.sleep(5000);
 
 }
   
}