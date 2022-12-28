package kitePOMUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteAppUserName {
	WebDriver driver;
	Sheet mySheet;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
    System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("incognito");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
			
		driver.get("https://kite.zerodha.com");
		Reporter.log("Launching browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File myFile=new File("E:\\selenium\\working excell sheet.xlsx");
		mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		login=new KiteLoginPage(driver);
		pin = new KitePinPage(driver);
		home= new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp()
	{
		String UN= mySheet.getRow(5).getCell(0).getStringCellValue();
		String PWD=mySheet.getRow(5).getCell(1).getStringCellValue();
		String PIN=mySheet.getRow(5).getCell(2).getStringCellValue();
		
		login.senduserName(UN);
		Reporter.log("sending username",true);
		login.sendPassword(PWD);
		Reporter.log("sending password",true);
		login.clickOnLoginButton();
		Reporter.log("clicking on login button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(PIN);
		Reporter.log("sending PIN");
		pin.clickOnContinueButton();
		Reporter.log("clicking on countinue button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
	}
	
		
  @Test
  public void validateUserName() 
  {
	  String expectedUN=mySheet.getRow(5).getCell(0).getStringCellValue();
	  String actualUN=home.getActualUserName();
	  Reporter.log("Validate UserName",true);
	  Assert.assertEquals(actualUN,expectedUN,"Actual and Expected UN are nit matching TC failed");
	  Reporter.log("Actual and expected UN are matching TC PASSES",true);
	  	  
  }
  @AfterMethod
  public void  logoutFromKite() throws InterruptedException
  {
	  home.clicklogOut();
	  Reporter.log("logging out...",true);
  }
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Reporter.log("Closing browser",true);
	  driver.close();
  }
}
