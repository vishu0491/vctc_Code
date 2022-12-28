package kiteTest;




import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import kitePomNew.KiteHomePage;
import kitePomNew.KiteLoginPage;
import kitePomNew.KitePinPage;
import kiteUtility.Utility;
import kiteUtility.UtilityProp;
import kitebase.BaseNew;


public class ValidateKiteUserIDProperty extends BaseNew {
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	String TCID="5555";
	@BeforeClass
	public void launchBrowser() throws IOException 
	{
		openBrowser();
		login =new KiteLoginPage(driver);
		pin=new KitePinPage(driver);
		home=new KiteHomePage(driver);
		
		
		
		
	}
	@BeforeMethod
	public void loginToKiteApp() throws IOException 
	{
		login.senduserName(UtilityProp.getDataFromPropertyFile("UN"));
		login.sendPassword(UtilityProp.getDataFromPropertyFile("PWD"));
		login.clickOnLoginButton();
		
		pin.sendPin(UtilityProp.getDataFromPropertyFile("PIN"));
		pin.clickOnContinueButton();
	}
	
  @Test
  public void validateUserID() throws Exception  
  {
	  Assert.assertEquals(home.getActualUserName(),UtilityProp.getDataFromPropertyFile("UN"));
	  
	  Utility.captureScreenshot(driver, TCID);
	
  }
  @AfterMethod
  public void clickTologout() throws InterruptedException
  {
	  home.clicklogOut();
	  
	  
  }
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
	  
  }
}
