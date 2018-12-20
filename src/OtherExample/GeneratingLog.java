package OtherExample;

import org.apache.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class GeneratingLog {
 WebDriver driver = null;
 
 @BeforeClass
 public void beforetest() {
	  System.setProperty("webdriver.gecko.driver",
	             "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\geckodriver.exe");

  driver = new FirefoxDriver();
  driver.manage().window().maximize();
  driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
 }
 
 @AfterClass
 public void aftertest() {
  driver.quit();
  
 }
 
 @Test
 public void test () throws InterruptedException 
 {  
 Logger log;
 driver.findElement(By.id("text1")).sendKeys("My First Name");
 //BasicConfigurator.configure();
 log = Logger.getLogger(GeneratingLog.class);
 log.info("Type In Text field.");
 Select mydrpdwn = new Select(driver.findElement(By.id("Carlist")));
 mydrpdwn.selectByVisibleText("Audi");
 log = Logger.getLogger(GeneratingLog.class);
 log.info("Select value from drop down.");
 WebDriverWait wait = new WebDriverWait(driver, 15);
 wait.until(ExpectedConditions.elementToBeClickable(By.id("text2")));
 }

   
}