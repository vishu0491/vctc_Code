package crossBrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTesting1 {
  @Parameters("browserName")
  @Test
  public void myMethod(String name) throws InterruptedException
  {
		  WebDriver driver= null;
		  
		  if(name.equals("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver\\geckodriver.exe");
				
				 
			    driver=new FirefoxDriver();
			   
		  }
		  else if (name.equals("chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
				
				 driver=new ChromeDriver();;
				  
		  }
		  
		  driver.manage().window().maximize();
		  driver.get("https://vctcpune.com");
		  Thread.sleep(2000);
		  driver.close();
		  
  }
}
