package webDriverBasicActionCommands;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class assertEquals{
	WebDriver driver;
	String Actualtext;
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
	} 
 
 @AfterClass
 
 public void tearDown() throws Exception { 
     driver.quit();
     } 
 
 //Method Example For Assertion
 @Test
	public void assertion_method_1() {
	Actualtext = driver.findElement(By.xpath("//h2/span")).getText();
	Assert.assertEquals(Actualtext, "Tuesday, 28 January 2014");
	System.out.print("\n assertion_method_1() -> Part executed");
 } 
 //Method Example For Assertion
 @Test
 public void assertion_method_2() {  
  Assert.assertEquals(Actualtext, "Tuesday, 29 January 2014");
  System.out.print("\n assertion_method_2() -> Part executed");
 }
 
 //Method Example For Verification
 @Test
 public void verification_method() {
  
  String time = driver.findElement(By.xpath("//div[@id='timeLeft']")).getText();
  
  if (time == "Tuesday, 28 January 2014")
  {
   System.out.print("\nText Match");
  }
  else
  {
   System.out.print("\nText does Match");
  }
 }
 
 
}