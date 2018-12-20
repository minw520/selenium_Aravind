package webDriverBasicActionCommands;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class isMultipleAndDeselectAll {
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
 public void test () throws InterruptedException 
 {  
  Select listbox = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
  
  //To verify that specific select box supports multiple select or not.
  if(listbox.isMultiple())
  {
   System.out.print("Multiple selections is supported");
   listbox.selectByVisibleText("USA");
   listbox.selectByValue("Russia");
   listbox.selectByIndex(5);
   Thread.sleep(3000);
 
   //To deselect all selected options.
   listbox.deselectAll();
   Thread.sleep(2000);
  }
  else
  {
   System.out.print("Not supported multiple selections");
  }
 }

}

