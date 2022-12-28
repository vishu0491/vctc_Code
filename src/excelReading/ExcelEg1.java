package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//need to create object of file class
		
		File myFile=new File("E:\\selenium\\working excell sheet.xlsx");
		
		//using workbookFactory class call create method and pass details 
		//to read string type of value 
		
		String city = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(city);
		
		System.out.println(WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue());

		//to read numaric value 
		
		double number = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		 System.out.println(number);
		 
		//to read boolean value
		 boolean value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();
		 System.out.println(value);
		 
		 //how to read char value
		 String charValue = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		
		 System.out.println(charValue);
	}

}
