package excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEx6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		File MyFile= new File("F:\\Selenium java\\Practice.xlsx");
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
		
		int TotalNumRow = MySheet.getLastRowNum();
		 int TotalNumCells = MySheet.getRow(0).getLastCellNum()-1;
		 
		 
		 for(int i=0;i<=TotalNumRow;i++) 
		 {
			 for(int j=0;j<=TotalNumCells;j++)
				 
			 { 	
			Cell cell = MySheet.getRow(i).getCell(j);
				 CellType Type = cell.getCellType();
				 
				 if(Type==CellType.STRING) {
					 System.out.print(cell.getStringCellValue()+" | ");
				 }
				 else if (Type==CellType.NUMERIC) {
					 System.out.print(cell.getNumericCellValue()+" | ");
				 }
				 else if(Type==CellType.BOOLEAN) {
					 System.out.print(cell.getBooleanCellValue()+" | ");
				 }
				 
				 else if(Type==CellType.BLANK) {
					 System.out.print("---|");
				 }
				 
				 
			 }
			 System.out.println(" ");
		
		 
	
	}

}
}
