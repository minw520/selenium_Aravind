package webDriverBasicActionCommands;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class selectingOrDeselectingValueFromDropDown {
 WebDriver driver = null;
 
 String localUrl= "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\";
 
 @BeforeClass
 public void beforetest() {
	 System.setProperty("webdriver.gecko.driver", localUrl +"geckodriver.exe");
  driver = new FirefoxDriver();
  driver.manage().window().maximize();
  driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
 }
 
 @AfterClass
 public void aftertest() {
  driver.quit();
  
 }
 
 @Test
 public void test_01 () throws InterruptedException 
 {  
  driver.findElement(By.id("text1")).sendKeys("My First Name");

  //Selecting value from drop down using visible text
  Select mydrpdwn = new Select(driver.findElement(By.id("Carlist")));
  mydrpdwn.selectByVisibleText("Audi");
  WebDriverWait wait = new WebDriverWait(driver, 15);
  wait.until(ExpectedConditions.elementToBeClickable(By.id("text2")));
 }
 
 
 public void test_02 () throws InterruptedException 
 {  
  driver.findElement(By.id("text1")).sendKeys("My First Name");

  //Selecting value from drop down by value
  Select listbox = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
  listbox.selectByValue("Italy");
  listbox.selectByValue("Mexico");
  listbox.selectByValue("Spain");

  driver.findElement(By.xpath("//input[@value='->']")).click();
  WebDriverWait wait = new WebDriverWait(driver, 15);
  wait.until(ExpectedConditions.elementToBeClickable(By.id("text2")));

//Selecting value from drop down by index
  listbox.selectByIndex(0);
  listbox.selectByIndex(3);
  driver.findElement(By.xpath("//input[@value='->']")).click();
  Thread.sleep(2000);
 }
 
   
}