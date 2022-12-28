package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			Thread.sleep(1000);

			driver.findElement(By.id("alertButton")).click();
	// 1. To handle alert popup we need to switch selenium focus from main 
			//page to alert popup by using syntax
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000);
			System.out.println(al.getText());
			al.accept();
		    Thread.sleep(3000);
			driver.close();
			
	}

}
