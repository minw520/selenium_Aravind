package OtherExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class custom_profile {
 WebDriver driver;
 
 @BeforeTest
 public void StartBrowser() {
  //Create object of webdriver's inbuilt class ProfilesIni to access Its method getProfile.
  ProfilesIni firProfiles = new ProfilesIni();
  //Get access of newly created profile WebDriver_Profile.
  FirefoxProfile wbdrverprofile = firProfiles.getProfile("WebDriver_Profile");
  //Pass wbdrverprofile parameter to FirefoxDriver.
  wbdrverprofile.setPreference("browser.popups.showPopupBlocker", false);
  
  FirefoxOptions firefoxOptions = new FirefoxOptions();
  firefoxOptions.setProfile(wbdrverprofile);

  System.setProperty("webdriver.gecko.driver",
          "C:\\Users\\ermao\\eclipse-Aravind\\AravindSeleniumWebdriverpart_1_2\\src\\browersExe\\geckodriver.exe");
  driver = new FirefoxDriver(firefoxOptions);  
 }
 
 @Test
 public void OpenURL(){
  driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");  
 }
 
 @AfterTest
 public void CloseBrowser() {
  driver.quit();  
 }
}
