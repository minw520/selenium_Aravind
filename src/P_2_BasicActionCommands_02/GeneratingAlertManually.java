package P_2_BasicActionCommands_02;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GeneratingAlertManually {
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
	 public void test () throws InterruptedException 
	 {  
	  //Generating Alert Using Javascript Executor
	  JavascriptExecutor javascript = (JavascriptExecutor) driver;
	  javascript.executeScript("alert('Test Case Execution Is started Now..');");
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	 }
 }
