package Wait;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class waitForElementInvisible {
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
 public void test () throws InterruptedException, IOException 
 { 
  //Wait for element invisible
  WebDriverWait wait = new WebDriverWait(driver, 15);
  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@id='text4']")));

  System.out.print("Text box text4 is now invisible");      
 }

   
}