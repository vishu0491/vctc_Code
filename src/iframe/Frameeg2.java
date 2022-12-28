package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frameeg2 {

	public static void main(String[] args) throws InterruptedException {
		
			
		  System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
			
			Thread.sleep(1000);
			driver.switchTo().frame("iframeResult");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@type='button']")).click();
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
			
			Thread.sleep(1000);
		
			driver.close();
			

	}

}
