package excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelreading_eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File Myfile = new File("F:\\Selenium java\\Practice.xlsx");
		String Name1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		System.out.println(Name1);
		String Name2 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		System.out.println(Name2);

		double Num1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(3).getCell(0).getNumericCellValue();
		System.out.println(Num1);

		double Num2 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(3).getCell(1).getNumericCellValue();
		System.out.println(Num2);

		boolean Value1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(4).getCell(1).getBooleanCellValue();
		System.out.println(Value1);

		boolean Value2 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(4).getCell(0).getBooleanCellValue();
		System.out.println(Value2);

		String Value3 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(5).getCell(0).getStringCellValue();
		System.out.println(Value3);
	}

}
