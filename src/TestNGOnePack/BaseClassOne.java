package TestNGOnePack;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClassOne {
    //Declared as public static to use same webdriver instance publicly
    public static WebDriver driver;

    //@BeforeSuite annotation describes this method has to run before all suites
    @BeforeSuite 
    public void setup() throws Exception { 
    	System.setProperty("webdriver.gecko.driver",
    			  "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\geckodriver.exe");
    			  driver = new FirefoxDriver();
    			  driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html"); 
    } 
    //@AfterSuite annotation describes this method has to run after execution of all suites
    @AfterSuite
         public void tearDown() throws Exception { 
         driver.quit(); 
    } 
}