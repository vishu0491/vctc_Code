package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://skpatro.github.io/demo/links/");
			Thread.sleep(2000);
			
			String mainPageID = driver.getWindowHandle();//ID OF main page
			System.out.println(mainPageID);
			
			System.out.println("===============================");
			//to open child browser
			
			driver.findElement(By.name("NewWindow")).click();
			Thread.sleep(2000);
			
			// to handle multiple window /to get multiple ids
			
			Set<String> allPageIDs = driver.getWindowHandles();
			
			Iterator<String> it = allPageIDs.iterator();
			
//			while(it.hasNext())
//			{
//				System.out.println(it.next());
//				
//			}
			
			String mainPageId=it.next();//will return to main page id 
			String childPageId=it.next();
			
			//to switch focus to child window
			
			driver.switchTo().window(childPageId);// changing focus 
			driver.manage().window().maximize();
			//Thread.sleep(1000);
			
			driver.findElement(By.id("the7-search")).sendKeys("selenium");
			Thread.sleep(1000);
			//driver.close();
			driver.quit();
			
//			driver.switchTo().window(mainPageId);
//			driver.findElement(By.xpath(childPageId))
//			
			
			
			
			
	}

}
