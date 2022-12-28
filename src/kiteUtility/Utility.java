package kiteUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	//excel
	//screenshot
	//closing
	

	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException {
		
		File myFile=new File("E:\\selenium\\working excell sheet.xlsx");
		Sheet mySheet=WorkbookFactory.create(myFile).getSheet("Sheet2");
		String value=mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
		
		
		public static void captureScreenshot(WebDriver driver,String TCID) throws Exception
		{
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("E:\\selenium\\screenshot\\fbimage"+TCID+".png");
			FileHandler.copy(src, dest);

	}


//		public static void captureScreenshot1(WebDriver driver, String tCID) {
//			// TODO Auto-generated method stub
			
		}


