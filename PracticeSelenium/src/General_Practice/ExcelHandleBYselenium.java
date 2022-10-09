package General_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHandleBYselenium {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File MyFile = new File("F:\\Selenium java\\Practice.xlsx");
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		
		
		int TotalRows = MySheet.getLastRowNum();
		System.out.println(TotalRows);
		int Totalcell = MySheet.getRow(0).getLastCellNum() - 1;
		System.out.println(Totalcell);

		System.out.println("==========");
		
		for ( int  i=0; i<= TotalRows; i++)
		{
			for (int j = 0; j <= Totalcell; j++)
			{
				String value = MySheet.getRow( i).getCell(j).getStringCellValue();
				System.out.print(value + " ");
			}
			System.out.println();
		}

	}

}
