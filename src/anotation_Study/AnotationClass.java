package anotation_Study;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnotationClass {
  @Test
  public void validateUserName() 
  {
	  Reporter.log("UserName Validated",true);
  }
  @Test
  public void validateDashBoard()
  {
	  Reporter.log("DashBoard Validate",true);
  }
  @BeforeMethod
  public void loginToKite()
  {
	  Reporter.log("login Success",true);
  }
  
 @AfterMethod
 public void LogOutFromKiteApp()
 {
	 Reporter.log("logged out.......",true);
 }
 @BeforeClass
 public void lunchBrowser()
 
 {
	Reporter.log("Launching browser",true); 
 }
 @AfterClass
 public void closeBrowser()
 {
	 Reporter.log("closing browser",true);
 }
 
}
