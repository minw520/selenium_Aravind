package P_2_BasicActionCommands_02;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class GeneratingMouseHoverEvent {
 WebDriver driver = null;
 String localUrl= "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\";
 String localNewTestfile_001 = "file:///C:/Users/ermao/eclipse-Aravind/AravindSeleniumWebdriverpart_1_2/src/UrlFiles/abcdg.html";
 
 
 
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
 public void aftertest() {
  driver.quit();
  
 }
 
 @Test
 public void test () throws InterruptedException, IOException 
 { 

  //Generate mouse hover event on main menu to click on sub menu
  Actions actions = new Actions(driver);
  WebElement moveonmenu = driver.findElement(By.xpath("//div[@id='menu1']/div"));
  actions.moveToElement(moveonmenu).moveToElement(driver.findElement(By.xpath("//div[@id='menu1choices']/a"))).click().perform();
  
  WebDriverWait wait = new WebDriverWait(driver, 15);
  wait.until(ExpectedConditions.titleContains("Google"));
 }
   
}
