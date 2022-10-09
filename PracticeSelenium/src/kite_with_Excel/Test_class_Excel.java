package kite_with_Excel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// we can use for single user
public class Test_class_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		 File MyFile = new File ("F:\\Selenium java\\New Microsoft Excel Worksheet.xlsx");
		
		 Sheet MYSheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		
		 String Username = MYSheet.getRow(0).getCell(0).getStringCellValue();//Username,Password,Pin are string value given in methods of class
		 String Password = MYSheet.getRow(0).getCell(1).getStringCellValue();
		 String Pin = MYSheet.getRow(0).getCell(2).getStringCellValue();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//For Kite_LogIN_Page 
		
		Kite_LogIN_Page KLP=new Kite_LogIN_Page(driver);
		KLP.SendUserName(Username);
		Thread.sleep(500);
		KLP.SendPassword(Password);
		KLP.ClickonLogInButton();
		
		
		//for Kite_Pin_Page 
		Kite_Pin_Page KPP= new Kite_Pin_Page(driver);
		
		KPP.Sendpin(Pin);
		
		KPP.ClickOnCountinueButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//for Kite_Home_Page 
		
		Kite_Home_Page KHP=new Kite_Home_Page(driver);
		KHP.ValidateUserid(Username);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		KHP.ClickOnLogOutButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		KHP.ChangeUser();
	
	}
	}

