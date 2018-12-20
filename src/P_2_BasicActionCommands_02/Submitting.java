package P_2_BasicActionCommands_02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Submitting {
 
  WebDriver driver = null;
  String localUrl= "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\";
  String localNewTestfile_001 = "file:///C:/Users/ermao/eclipse-Aravind/AravindSeleniumWebdriverpart_1_2/src/UrlFiles/abcdl.html";
 
  @BeforeTest
  public void setup() throws Exception { 
  // set geckodriver path.
	  System.setProperty("webdriver.gecko.driver", localUrl +"geckodriver.exe");
	  //To open Firefox browser
	  driver = new FirefoxDriver();

         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
           driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html"); 
//         driver.get(localNewTestfile_001);

  } 
 
  @AfterTest
  public void tearDown() throws Exception { 
   driver.quit();
     } 
  
  @Test
  public void LogIn_Test(){
   driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("MyFName");
   driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("MyLName");
   driver.findElement(By.xpath("//input[@name='EmailID']")).sendKeys("My Email ID");
   driver.findElement(By.xpath("//input[@name='MobNo']")).sendKeys("My Mob No.");
   driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("My Comp Name");
   //To submit form.
   //You can use any other Input field's(First Name, Last Name etc.) xpath too In bellow given syntax.
   driver.findElement(By.xpath("//input[@name='Company']")).submit();
   String alrt = driver.switchTo().alert().getText();
   driver.switchTo().alert().accept();
   System.out.println(alrt);
  }
}