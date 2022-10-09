package excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelreadingEx3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File MyFile=new File("F:\\Selenium java\\Practice.xlsx");
	Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
	int lastRowNumber = Mysheet.getLastRowNum();
	int TotalRowCount = lastRowNumber;
	System.out.println(TotalRowCount);
	
	int LastCellNumber = Mysheet.getRow(0).getLastCellNum();
	int TotalCellcount = LastCellNumber-1;
      System.out.println(TotalCellcount);
      
     //static coding for reading whole row
      
//      for(int i=0;i<=1;i++)
//      {
//    	 System.out.println(Mysheet.getRow(0).getCell(i).getStringCellValue());
//    	      }
      
     // dynamic coding for reading whole row
      for(int i=0;i<=TotalCellcount;i++)
      {
    
    	  String value = Mysheet.getRow(0).getCell(i).getStringCellValue();
    	  System.out.print(value+(" "));
    	  
	}
System.out.println(" ");
}  
}