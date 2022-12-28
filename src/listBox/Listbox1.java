package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		//1.Identify list box to be handle and store it in reference variable
		WebElement dropDown=driver.findElement(By.name("dropdown-class-example"));
		
		//2.Create an object of Select class which will accept WebElement as argument 
		
		Select s=new Select(dropDown);
		
		//3.By using one of the select class methods we can select values form list 
		//box like
	    Thread.sleep(500);
	    s.selectByVisibleText("Option3");
	    Thread.sleep(500);
	    s.selectByIndex(1);
	    Thread.sleep(500);
	    s.selectByValue("option2");
	    Thread.sleep(500);
	    s.deselectByValue("option1");
	    
	    
	    
	    
		

		

	}

}
