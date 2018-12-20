package webDriverBasicActionCommands;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertFalseAssertion{
 WebDriver driver;
 String Actualtext;
 String localUrl= "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\";
 String localNewTestfile_001 = "file:///C:/Users/ermao/eclipse-Aravind/AravindSeleniumWebdriverpart_1_2/src/UrlFiles/abcdk.html";
 
 WebElement chk1, chk2;
 
 @BeforeClass
 public void beforetest() {

  // set geckodriver path.
	 System.setProperty("webdriver.gecko.driver", localUrl +"geckodriver.exe");
 //To open Firefox browser
 driver = new FirefoxDriver();

  //driver.get("http://http://only-testing-blog.blogspot.com/2013/11/new-test.html");
 driver.get(localNewTestfile_001);

   // driver.get("http://only-testing-blog.blogspot.in/2014/02/attributes.html");
  chk1 = driver.findElement(By.xpath("//input[@name='option1']"));
  chk2 = driver.findElement(By.xpath("//input[@name='option2']"));  
 } 

 
 @AfterClass
 public void aftertest() {
  driver.quit();
  
 }
 
 //Method Example For Assertion
 @Test
 public void assertfalse1() {
	  System.out.print(" \n chk1.isSelected()"+chk1.isSelected());
	  Assert.assertFalse(chk1.isSelected());
	 }
	 //Assertion Method - will Pass
@Test
	 public void assertfalse2() {
	  System.out.print("\n chk2.isSelected()"+chk2.isSelected());
	  System.out.print("\n");
	  Assert.assertFalse(chk2.isSelected());
	 }
}