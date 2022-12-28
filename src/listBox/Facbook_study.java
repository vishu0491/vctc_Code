package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facbook_study {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@rel='nofollow']")).click();
		Thread.sleep(1000);
	
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		
		Select s=new Select(day);
		Thread.sleep(1000);
		s.selectByVisibleText("3");
		Thread.sleep(1000);
		
		Select m=new Select(month);
		m.selectByValue("2");
		Thread.sleep(1000);
		
		
		Select y=new Select(year);
		y.selectByIndex(3);
		
		
	  Thread.sleep(5000);
	 //  driver.close();
	   
		
		
		
		
		
		
		

	}

}
