package Wait;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class waitForElementToBeClickable {
	 WebDriver driver = null;
	 
	 @BeforeClass
	 public void openbrowser() { 
		  System.setProperty("webdriver.gecko.driver",
		    "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();

	  driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 }
	 
	 @AfterClass
	 public void aftertest() {
	  driver.quit();
	  
	 }
	 
	 @Test
	  public void test () 
	   {  
	    
	    driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("My Name");
	    //Wait for element to be clickable
	    WebDriverWait wait = new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#submitButton")));

	    driver.findElement(By.cssSelector("#submitButton")).click();
	   }
	 public void HighlightMyElement(WebElement element) { 
	  for (int i = 0; i < 10; i++) 
	  { 
	   JavascriptExecutor javascript = (JavascriptExecutor) driver;
	   javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: orange; border: 4px solid orange;");
	   javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: pink; border: 4px solid pink;");
	   javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: yellow; border: 4px solid yellow;");
	   javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, ""); 
	   } 
	  } 
	 }


