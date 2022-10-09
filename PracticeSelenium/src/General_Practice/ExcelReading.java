package General_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File File = new File("F:\\Selenium java\\Practice.xlsx");
//		String Data = WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		System.out.println(Data);

		Sheet MySheet = WorkbookFactory.create(File).getSheet("Sheet2");
		int TotalRow = MySheet.getLastRowNum();
		int TotalCell = MySheet.getRow(0).getLastCellNum()-1;

		System.out.println(TotalRow);
		System.out.println(TotalCell);
		
		for(int i=0;i<=TotalRow;i++) {
			for(int j=0;j<=TotalCell;j++) {
			 String Cell = MySheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(Cell+"|| ");
			}
			System.out.println();
		}
		
		
	}

}
