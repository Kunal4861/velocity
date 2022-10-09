package excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.batik.css.engine.value.Value;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelreading_eg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File MyFile = new File("F:\\Selenium java\\Practice.xlsx");
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");

		int TotalNumRow = MySheet.getLastRowNum();
		System.out.println(TotalNumRow);

		// static coding for reading one column
//		for (int i = 0; i <= 3; i++) {
//			String Value = MySheet.getRow(i).getCell(2).getStringCellValue();
//			System.out.println(Value);
//	/	}
		// dynamic coding for reading one column
		
		for(int i=0;i<=TotalNumRow;i++)
		{
			String Value = MySheet.getRow(i).getCell(2).getStringCellValue();
		System.out.println(Value);
	} 
}
}