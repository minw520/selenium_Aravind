package P_2_BasicActionCommands_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class DeselectOptionByVisibleTextOrValueOrByIndex {
 WebDriver driver = null;
 String localUrl= "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\";
 String localNewTestfile_001 = "file:///C:/Users/ermao/eclipse-Aravind/AravindSeleniumWebdriverpart_1_2/src/UrlFiles/abcdm.html";
 
	 
 @BeforeClass
 public void beforetest() {
	 System.setProperty("webdriver.gecko.driver", localUrl +"geckodriver.exe");
  driver = new FirefoxDriver();
  driver.manage().window().maximize();
  //driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
  driver.get(localNewTestfile_001);
 }
 
 @AfterClass
 public void aftertest() {
  driver.quit();
  
 }
 
 @Test
 public void test () throws InterruptedException 
 {  
  driver.findElement(By.id("text1")).sendKeys("My First Name");

  Select listbox = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
  listbox.selectByVisibleText("USA");
  listbox.selectByVisibleText("Russia");
  Thread.sleep(1000);
  
//To deselect by visible text
  listbox.deselectByVisibleText("Russia");
  Thread.sleep(1000);
  
  listbox.selectByValue("Japan");
  listbox.selectByValue("Mexico");
  Thread.sleep(1000);
  
//To deselect by value
  listbox.deselectByValue("Mexico");
  Thread.sleep(1000);
  
  listbox.selectByIndex(4);
  listbox.selectByIndex(5);
  Thread.sleep(1000);
  
//To deselect by index
  listbox.deselectByIndex(5);
  Thread.sleep(1000);

  driver.findElement(By.xpath("//input[@value='->']")).click();
  Thread.sleep(1000);
 }   
}

