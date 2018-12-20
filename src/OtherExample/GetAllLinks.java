package OtherExample;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class GetAllLinks {
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
 try {
   List<WebElement> no = driver.findElements(By.tagName("a"));
   int nooflinks = no.size(); 
   System.out.println(nooflinks);
   for (WebElement pagelink : no)
        {
         String linktext = pagelink.getText();
         String link = pagelink.getAttribute("href"); 
         System.out.println(linktext+" ->");
         System.out.println(link);
         }
  }catch (Exception e){
            System.out.println("error "+e);
        }
          
 }

   
}