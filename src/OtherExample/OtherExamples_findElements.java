package OtherExample;

//import java.awt.List;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class OtherExamples_findElements {
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
  //driver.quit();
 }
 
 @Test
 public void test () throws InterruptedException 
 { 
  WebElement option = driver.findElement(By.xpath("//option[@id='country5']"));
  System.out.print(option.getAttribute("id")+" - "+option.getText());
  
  List<WebElement> options= driver.findElements(By.xpath("//option"));
  System.out.println("the size is "+ options.size());
  for(int i=0;i<=options.size()-1;i++)
  {
   String str = options.get(i).getAttribute("id")+" - "+options.get(i).getText();
   System.out.println("this is the" + i + "time"+ str);
  }
 }
}