package actionClass;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(1000);
		
		//1.Creat object of Action to be perform 
		
		Actions act=new Actions(driver);
		
		//2,identify Element where action to be perform 
		
		  WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//3.using Action class methods perform desired operation (context click/Right click)
		 
		
		//1st method 
//		 act.moveToElement(rightClickButton).perform(); //move mouse to desired location
//		 
//		 act.contextClick().perform();//perform right click operation 
		 
		 //2nd method 
		// act.moveToElement(rightClickButton).contextClick().build().perform();
		 
		 //3rd method
		// act.contextClick(rightClickButton).perform();
		 
		 //clcik on webelement using Action class
		WebElement SeleniumButton = driver.findElement(By.linkText("Selenium"));
		 
		 act.click(SeleniumButton).perform();
		 act.moveToElement(SeleniumButton).click().build().perform();
		 
		// act.doubleClick(SeleniumButton)
		 
		 
		 
		
		

	}

}
