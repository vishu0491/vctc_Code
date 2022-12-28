package interview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_FindElemets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
	      WebDriver driver = new ChromeDriver();
	      //implicit wait
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      //URL launch
	      driver.get("https://www.tutorialspoint.com/upsc_ias_exams.htm");
	      //identify single element
	      WebElement elm = driver.findElement(By.tagName("h2"));
	      String s = elm.getText();
	      System.out.println("Get text on element: " + s);
	      //identify all elements with tagname
	      List<WebElement> i = driver.findElements(By.tagName("img"));
	      //count
	      int c = i.size();
	      System.out.println("Number of images: " + c);
	      //browser close
	      driver.close();
	   }
	

	}


