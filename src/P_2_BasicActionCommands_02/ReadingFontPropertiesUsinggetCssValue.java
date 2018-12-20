package P_2_BasicActionCommands_02;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadingFontPropertiesUsinggetCssValue { 
WebDriver driver = null;
String localUrl= "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\";
    @BeforeTest
    public void setup() throws Exception {  
    	 System.setProperty("webdriver.gecko.driver", localUrl +"geckodriver.exe");
  driver = new FirefoxDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
    }

    @AfterClass
    public void aftertest() {
     driver.quit();
     
    }
 @Test
 public void readFontProperty(){
  //Locate text string element to read It's font properties.
  WebElement text = driver.findElement(By.xpath("//h1[contains(.,'Example Login Page')]"));
  
  //Read font-size property and print It in console.
  String fontSize = text.getCssValue("font-size");
  System.out.println("Font Size -> "+fontSize);
  
  //Read color property and print It in console.
  String fontColor = text.getCssValue("color");
  System.out.println("Font Color -> "+fontColor);
  
  //Read font-family property and print It in console.
  String fontFamily = text.getCssValue("font-family");
  System.out.println("Font Family -> "+fontFamily);
  
  //Read text-align property and print It in console.
  String fonttxtAlign = text.getCssValue("text-align");
  System.out.println("Font Text Alignment -> "+fonttxtAlign);
 }
}
