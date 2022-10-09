package kite_with_Excel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Kite_TestNG_with_excell {
	WebDriver driver;
	Kite_LogIN_Page login;
	Kite_Pin_Page pin;
	Kite_Home_Page home;
	File Myfile;
	Sheet mySheet;
	@BeforeClass
	public void launchbrowser() throws EncryptedDocumentException, IOException 
	{System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize()	;
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		Reporter.log("opening browser with url",true);
		 login= new Kite_LogIN_Page(driver);
		 pin= new Kite_Pin_Page(driver);
		 home=new Kite_Home_Page(driver);
		  Myfile= new File("F:\\Selenium java\\practice1.xlsx");
		 mySheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		 
		
	}
	@BeforeMethod
	public void logIn()
	{
		login.SendUserName(mySheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("entring user name",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.SendPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("entring password",true);
		login.ClickonLogInButton();
		Reporter.log("clicking on log in button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        pin.Sendpin(mySheet.getRow(0).getCell(2).getStringCellValue());
        Reporter.log("entring user name",true);
		pin.ClickOnCountinueButton();
		Reporter.log("clicking on continue in button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
  @Test
  public void useridvalidation() 
  {
	 String actualuserid = home.ValidateUserid1();
	 String expecteduserid = (mySheet.getRow(0).getCell(0).getStringCellValue());
	 Assert.assertEquals(actualuserid, expecteduserid, "Actual user id is not matching to expected user id,TC is failed");
	 Reporter.log("Actual user id is matching to expected user id,TC is passed",true);
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  @AfterMethod
  public void logout() throws InterruptedException
  {
	  home.ClickOnLogOutButton();
	  Reporter.log("logout....",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  @AfterClass
  public void exit()
  { driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  Reporter.log("closing browser",true);
	 
	  driver.close();
	
	  
  }
  
  
}
