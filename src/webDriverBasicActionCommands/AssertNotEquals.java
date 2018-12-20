package webDriverBasicActionCommands;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertNotEquals{
  
	 String Actualtext;
	 String localUrl= "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\";
	 String localNewTestfile_001 = "file:///C:/Users/ermao/eclipse-Aravind/AravindSeleniumWebdriverpart_1_2/src/UrlFiles/abcdh.html";
	 WebDriver driver;
  
 @BeforeClass
 public void beforetest() {
	// set geckodriver path.
	System.setProperty("webdriver.gecko.driver", localUrl +"geckodriver.exe");
	//To open Firefox browser
	driver = new FirefoxDriver();
	//driver.get("http://only-testing-blog.blogspot.in/p/mouse-hover.html");
	driver.get(localNewTestfile_001);
	 Actualtext = driver.findElement(By.xpath("//h2/span")).getText();   ///html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/h2/span
 } 

 @AfterClass
  	public void aftertest() {
	driver.quit();
}
  
  
 //Method Example For Assertion
 @Test
 public void assertion_method_1() {
 System.out.print(Actualtext+"is the text, but test method1 thinks it is Tuesday, 28 January 2014, so NotEquals fails \n");
 Assert.assertNotEquals(Actualtext, "Tuesday, 28 January 2014", "Expected and actual match in assertion_method_1");
 System.out.print("\n assertion_method_1() -> Part executed");
}

//Assertion Method
@Test
public void assertion_method_2() {  
	System.out.println("\n test method2 think it is ---Tuesday, 29 January 2014--- so NotEquals passes");
 Assert.assertNotEquals(Actualtext, "Tuesday, 29 January 2014", "Expected and actual match in assertion_method_2");
 System.out.print("\n assertion_method_2() -> Part executed");
}
}