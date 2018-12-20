package P_2_BasicActionCommands_02;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class OpeningAndMaximizingFirefoxBrowserAndOpeningURL { 
 
 WebDriver driver = null;
 String localUrl= "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\";
 
 @BeforeClass
 public void beforetest() {

  // set geckodriver path.
	 System.setProperty("webdriver.gecko.driver", localUrl +"geckodriver.exe");
 //To open Firefox browser
 driver = new FirefoxDriver();

 //To Maximize Browser Window
  driver.manage().window().maximize();

 //To Open URL In browser
  driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
 }
 
 @AfterClass
 public void aftertest() {
  driver.quit();
 }
 
 @org.testng.annotations.Test
 public void test() 
  {
   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
   String  datentime = driver.findElement(By.className("date-header")).getText();//Locating element by className and store its text to variable datentime.
   System.out.print(datentime);
  }
 
 }
