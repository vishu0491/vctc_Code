package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethodUse {

	public static void main(String[] args) throws InterruptedException {
		
     	 System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	 
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.name("checkBoxOption3")).click();
		 
		 //get text method use 
		 
		 System.out.println(driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")));

	}

}
