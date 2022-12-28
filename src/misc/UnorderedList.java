package misc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/webhp");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Honda");
		
		Thread.sleep(1000);
		
		List<WebElement> searchResults = driver.findElements(By.xpath("//ul[@class='G43f7e'][1]//li"));
		
		System.out.println(searchResults.size());
		
		//Iterator<WebElement> it=searchResult.iterator();
		for(WebElement r:searchResults)
		{
		    System.out.println(r.getText());
		}
		for(WebElement result:searchResults)
		{
			String actualText = result.getText();
			String expectedText = "honda shine";
			
			if(actualText.equals(expectedText))
			{
				result.click();
				break;
			}
		}
		
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(1000);
		driver.close();
		
	}

}
