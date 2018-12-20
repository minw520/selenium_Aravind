package P_2_BasicActionCommands_02;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClickingOnButton { 
 
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
 public void test() {
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  for (int i = 0; i<=20; i++)
	  {
	   WebElement  btn = driver.findElement(By.id("submitButton"));//Locating element by id
	   if (btn.isEnabled()) 
	   {
	    //if webelement's attribute found enabled then this code will be executed.
	    System.out.print("\nCongr8s... Button is enabled and webdriver is clicking on it now \n");

	   //Locating button by id and then clicking on it.
	    driver.findElement(By.id("submitButton")).click(); 
	    i=20;
	       }
	   else
	   {
	    //if webelement's attribute found disabled then this code will be executed.
	    System.out.print("\nSorry but Button is disabled right now..");
	   }
	   try {
	    Thread.sleep(500);
	   } catch (InterruptedException e) {
	    e.printStackTrace();
	   }
	  }
	 }
}