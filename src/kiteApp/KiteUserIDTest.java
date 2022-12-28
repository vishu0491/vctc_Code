package kiteApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteUserIDTest {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com");
		
		Thread.sleep(1000);
		
		WebElement userID = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userID.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		loginButton.click();
		
		Thread.sleep(1000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		
		WebElement continueButton= driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("982278");
		continueButton.click();
		
		Thread.sleep(2000);
		
		WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String actualUserName = userName.getText();
		String expectedUserName = "ELR321";
		
		if(actualUserName.equals(expectedUserName))
		{
			System.out.println("UserID matching TC is PASSED");
		}
		else 
		{
			System.out.println("UserID is not matching TC is FAILED");
		}
	
		
		userName.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
	}

}
