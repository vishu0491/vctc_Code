package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myFile=new File("E:\\selenium\\working excell sheet.xlsx");
		Workbook work = WorkbookFactory.create(myFile);
		Sheet mysheet = work.getSheet("Sheet1");
		Row myRow = mysheet.getRow(1);
		Cell myCell = myRow.getCell(1);
		CellType cellinfo = myCell.getCellType();
		System.out.println(cellinfo);
		System.out.println("=============================");
		
		//code for reading multiple date from excel
		Sheet mysheet1 = work.getSheet("sheet2");
		
	     for(int i=0;i<=2;i++)
	     {
	    	 for (int j=0;j<=2;j++)
	    	 {
	    		 String value = mysheet1.getRow(i).getCell(j).getStringCellValue();
	    		 System.out.print(value+" ");
	    		 
	    	 }
	    	 System.out.println();
	     }
	     System.out.println("====================================");
		
		
		

	}

}
