package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS2 {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
              
		WebDriver driver =new ChromeDriver();
		driver.get(null);
		
		driver.findElement(By.xpath(null));
		
	}

}
