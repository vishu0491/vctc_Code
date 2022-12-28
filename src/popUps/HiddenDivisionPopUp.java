package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://unicreds.com/contact-us");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//span[@aria-hidden="true"]")).click();
//			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("one plus 10r");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//button[@type='submit']")).click();
//			

	}

}
