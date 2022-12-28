package my_First_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_code {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://pmkisan.gov.in/NewHome3.aspx");
	    //driver.close();
		//driver.quit();
		
		driver.manage().window().maximize();
		
	    driver.manage().window().minimize();
		
	}

}
