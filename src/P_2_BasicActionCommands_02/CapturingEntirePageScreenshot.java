package P_2_BasicActionCommands_02;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CapturingEntirePageScreenshot {
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
 public void test () throws InterruptedException, IOException 
 { 
  //Capture entire page screenshot and then store it to destination drive
  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  FileUtils.copyFile(screenshot, new File("C:\\screenshot.jpg"));
  System.out.print("Screenshot is captured and stored in your D: Drive");
 }

   
}