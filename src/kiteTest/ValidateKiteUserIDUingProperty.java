package kiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kitePomNew.KiteHomePage;
import kitePomNew.KiteLoginPage;
import kitePomNew.KitePinPage;
import kiteUtility.Utility;
import kitebase.Base;

public class ValidateKiteUserIDUingProperty extends Base {
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	String TCID="5555";
	 
	
	@BeforeClass
	public void launchBrowser()
	{
		openbrowser();
		login=new KiteLoginPage(driver);
		pin=new KitePinPage(driver);
		
		home=new KiteHomePage(driver);
		
		
	}
	@BeforeMethod
	public void LoginTokiteApp() throws EncryptedDocumentException, IOException 
	{
		login.senduserName(Utility.readDataFromExcel(5,0));
		login.sendPassword(Utility.readDataFromExcel(5,1));
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(Utility.readDataFromExcel(5,2));
		pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
	@Test
	public void validateUserID() throws Exception
	{
		Assert.assertEquals(home.getActualUserName(), Utility.readDataFromExcel(5, 
				0),"Actual and Expected are not matching TC is failed");
		Utility.captureScreenshot(driver, TCID);
		Reporter.log(TCID);
	}
	@AfterMethod
	public void logOutFromKite() throws InterruptedException
	{
		home.clicklogOut();
		
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
 
  }

