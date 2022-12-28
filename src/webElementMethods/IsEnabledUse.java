package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledUse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//h2[@class='login-page-container__title__1fkph']")).click();
		
		Thread.sleep(10000);
		
		WebElement getOtpButton =driver.findElement(By.name("//button[text()='Get OTP']"));
		
		boolean result1=getOtpButton.isEnabled();
		
		System.out.println("Result is "+result1);
		
		driver.findElement(By.id("mobilenumber")).sendKeys("88888888");
		 
		Thread.sleep(100);
		
		
		
		
		
		
		
		

	}

}
