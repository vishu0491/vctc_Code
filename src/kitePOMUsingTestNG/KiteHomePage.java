package kitePOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	//1
	@FindBy(xpath="//span[@class='user-id']")private WebElement userName;
	@FindBy(xpath="//a[@target='_self']")private WebElement logOutButton;
	
	//2
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//3
	public void validateUserName(String expectedUserID)
	{
		String expectedUserName=expectedUserID;
		String actualUserName=userName.getText();
		
		if (expectedUserName.equals(actualUserName))
		{
			System.err.println("Actual and Expected User id are matching Tc is passed");
		}
		else {
			System.out.println("Actual and Expected User id are not matching Tc failed ");
	}
  }
//	//to get actual userName
	public String getActualUserName()
	{
		String actualUserName=userName.getText();
		return actualUserName;
	}

	public void clicklogOut() throws InterruptedException
	{
		userName.click();
		Thread.sleep(2000);
		logOutButton.click();
		
	}
		
}

	


