package kitebase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kiteUtility.UtilityProp;

public class BaseProp {
	protected static WebDriver driver;
	
	public void openBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get(UtilityProp.getDataFromPropertyFile("URL"));
        
}
	
}
