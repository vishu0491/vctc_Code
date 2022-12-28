package crossBrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  public void myMethod() {
	  System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver\\geckodriver.exe");
		
		 
		  WebDriver driver=new FirefoxDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://vctcpune.com");
			
			//Thread.sleep(1000);
  }
}
