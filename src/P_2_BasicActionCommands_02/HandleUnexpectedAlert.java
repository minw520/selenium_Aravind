package P_2_BasicActionCommands_02;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HandleUnexpectedAlert {
 WebDriver driver = null;
 String localUrl= "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\";
 String localNewTestfile_001 = "file:///C:/Users/ermao/eclipse-Aravind/AravindSeleniumWebdriverpart_1_2/src/UrlFiles/abcdi.html";
  	 
 @BeforeClass
 public void beforetest() {

	// set geckodriver path.
	System.setProperty("webdriver.gecko.driver", localUrl +"geckodriver.exe");
  driver = new FirefoxDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  driver.get("http://only-testing-blog.blogspot.in/2014/06/alert_6.html");
 }

 @AfterClass
 public void tearDown() throws Exception {
  driver.quit();
 }

 @Test
 public void Text() throws InterruptedException {
  //To handle unexpected alert on page load.
  try{   
   driver.switchTo().alert().dismiss();  
  }catch(Exception e){ 
   System.out.println("unexpected alert not present");   
  }
  
  driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("fname");
  driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("lname");
  driver.findElement(By.xpath("//input[@type='submit']")).click();
 }
}
