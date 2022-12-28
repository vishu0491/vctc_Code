package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flag {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/webhp");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Indian flag");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='wM6W7d WggQGd']")).click();
	}

}
