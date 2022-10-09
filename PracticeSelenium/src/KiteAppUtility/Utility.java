package KiteAppUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.ScreenshotException;

import net.bytebuddy.utility.RandomString;

public class Utility 

{
	
	public static String readDatafromExcel(int row, int cell) throws EncryptedDocumentException, IOException 
	
	{
		File myFile = new File("F:\\Selenium java\\practice1.xlsx");
		Sheet mySheet = (WorkbookFactory.create(myFile).getSheet("Sheet2"));
		String value = (mySheet.getRow(row).getCell(cell)).getStringCellValue();
		return value;
		}
	
	public static void takeScreenshot(WebDriver driver) throws IOException 
	{
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(3);
		 File Destination = new File("F:\\Screenshot\\Sceenshotname"+random+".png");
		FileHandler.copy(Source, Destination);
	}
}
