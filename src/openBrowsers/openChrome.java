package openBrowsers;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openChrome {

 public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.get("http://www.google.com");
  
  if (driver.findElement(By.xpath("//input[@name='q']")).isEnabled()) {
   System.out.println("Google search text box Is enabled.");
   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("WebDriver Test successful.");
   System.out.println("001");
   driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
   System.out.println("002");
   System.out.println("Google search completed.");
  } else {
   System.out.println("Google search test box Is Not enabled.");

  }
  driver.close();
 }
}

