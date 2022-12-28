package iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frameeg3 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
			
			Thread.sleep(1000);
			
			driver.switchTo().frame("frame1");
			Thread.sleep(1000);
			driver.findElement(By.tagName("input")).sendKeys("selinium");
			Thread.sleep(1000);
			driver.switchTo().frame("frame3");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("frame2");
			Thread.sleep(1000);
			
		    WebElement animal =driver.findElement(By.id("Animals"));
			
			Select s=new Select(animal);
			Thread.sleep(500);
			s.selectByIndex(2);
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//h1[@class='breadcrumb-item']")).getText();
			Thread.sleep(1000);
			driver.close();
			
			
			
		
			

	}

}
