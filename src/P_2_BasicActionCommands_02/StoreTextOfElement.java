package P_2_BasicActionCommands_02;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StoreTextOfElement { 
 
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
 public void test() 
 {
  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 //Locating element by tagName and store its text in to variable dropdown.
  String dropdown = driver.findElement(By.tagName("select")).getText();
  System.out.print("Drop down list values are as bellow :\n"+dropdown);
 }

 
 }