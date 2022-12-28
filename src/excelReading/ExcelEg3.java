package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myFile=new File("E:\\selenium\\working excell sheet.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		int totalNumberOfRows= mySheet.getLastRowNum();
		
		int rowCount = totalNumberOfRows;
		System.out.println("Total number of rows "+rowCount);
		
		short totalNumberOfColumns = mySheet.getRow(totalNumberOfRows).getLastCellNum();
		int columnCount = totalNumberOfColumns-1;
		System.out.println("Total number of colums are"+columnCount);
		//System.out.println("Cell Type is"+mySheet.getRow(1).getCell(1).getCellType());
		
		for(int i=0;i<=rowCount;i++)
		{
		
			for(int j=0;j<=columnCount;j++)
			{
				Cell myCell = mySheet.getRow(i).getCell(j);
				CellType dataType = myCell.getCellType();
				
				if(dataType==CellType.STRING)
				{
					String value = myCell.getStringCellValue();
					
					System.out.print(value+" ");
				}
				
				else if (dataType==CellType.NUMERIC)
				{
					double value = myCell.getNumericCellValue();
					System.out.print(value+" ");
				}
				
				else if(dataType==CellType.BOOLEAN)
				{
					boolean value = myCell.getBooleanCellValue();
					System.out.print(value+" ");
							
				}
				
				else if(dataType==CellType.BLANK)
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
			
			
				
				
			}
		}

	}


