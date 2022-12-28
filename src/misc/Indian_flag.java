package misc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indian_flag {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/webhp");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("flag");
		Thread.sleep(1000);
		List<WebElement> list = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		 Iterator<WebElement> it=list.iterator();
		 
		
	   System.out.println("=====un order======");
		
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		for(WebElement ref:list)
		{
			
			String actualText = ref.getText();
			String expectedText = "flag of india";
			if(actualText.equals(expectedText))
			{
				ref.click();
				break;
			}
		}
		
		    driver.findElement(By.linkText("Images")).click();
		    Thread.sleep(1000);
			List<WebElement> imagelist=driver.findElements(By.tagName("img"));
			System.out.println();
			
			System.out.println("=====image on web page====");
			
			System.out.println(imagelist.size());
			
			
			
			Thread.sleep(2000);
		    driver.close();
//			
		}
		
		
		
		
	}


