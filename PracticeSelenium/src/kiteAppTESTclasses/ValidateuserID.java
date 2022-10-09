package kiteAppTESTclasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteAppUtility.Utility;
import kiteAppBaseClass.KiteAppBaseClasses;
import kiteAppPOM.KitLOGINpage;
import kiteAppPOM.KiteHOMEpage;
import kiteAppPOM.KitePINpage;

public class ValidateuserID extends KiteAppBaseClasses {
	
	KitLOGINpage Login;
	KitePINpage pin;
	KiteHOMEpage HOME;
	
	
	@BeforeClass
	
	public void launchBrowser()
	{
		openBrowser();
		 Login = new KitLOGINpage(driver);
		 pin=new KitePINpage(driver);
		 HOME=new KiteHOMEpage(driver);
	}
	@BeforeMethod
	public void LogintoApp() throws EncryptedDocumentException, IOException {
		Login.sendUserName(Utility.readDatafromExcel(0, 0));//utility is class and read data from excel is method	
		Reporter.log("enteing userID",true);
		Login.sendPassword(Utility.readDatafromExcel(0, 1));//utility is class and read data from excel is method	
		Reporter.log("entering password",true);
		Login.clickOnLoginButton();
		Reporter.log("Click on LogIn button");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		pin.sendPin(Utility.readDatafromExcel(0, 2));//utility is class and read data from excel is method	
		Reporter.log("enteing pin",true);
		pin.clickOnContinueButton();
		Reporter.log("Click on continue button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		
	}
  @Test
  public void validateuserNAME() throws EncryptedDocumentException, IOException
  {
	  String actualuserNAME = HOME.getActulUserID();
	  String expectedUserID = Utility.readDatafromExcel(0, 0);
	  
	  
	  Assert.assertEquals(actualuserNAME, expectedUserID,"Actual user id is not matching to Expected User id, Test Case is failed");
	  Reporter.log("Actual user id is  matching to Expected User id, Test Case is passed",true);
	  
	  Utility.takeScreenshot(driver);
  }
  
  @AfterMethod
  public void logout() throws InterruptedException 
  {
	  HOME.clickOnLogoutButton();
	  Reporter.log("Log Out",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
  }
@AfterClass
public void closingBrowser()
{
	Reporter.log("closing Browser",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	driver.close();
	
	
}
	  
  

}