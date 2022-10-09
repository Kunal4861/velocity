package kiteAppTESTclasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteAppUtility.UtilityUsingProperties;
import kiteAppBaseClass.KiteAppBAseclassesusingProperties;
import kiteAppPOM.KitLOGINpage;
import kiteAppPOM.KiteHOMEpage;
import kiteAppPOM.KitePINpage;

public class KiteAppUSingProperties extends KiteAppBAseclassesusingProperties {    //testclass extends baseclass
	
	
	KitLOGINpage Login;
	KitePINpage pin;
	KiteHOMEpage HOME;

	
	@BeforeClass
	
	public void launchBrowser() throws IOException
	{
		openBrowser();
		Login = new KitLOGINpage(driver);
		 pin=new KitePINpage(driver);
		 HOME=new KiteHOMEpage(driver); 
		 
	}
	
	@BeforeMethod
	public void logintoKITE() throws IOException	
	{
		
		 Login.sendUserName(UtilityUsingProperties.readDatafromProperty("UN"));
		 Login.sendPassword(UtilityUsingProperties.readDatafromProperty("PWD"));
		 Login.clickOnLoginButton();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		 pin.sendPin(UtilityUsingProperties.readDatafromProperty("PIN"));
		 pin.clickOnContinueButton();
		 
	}
  @Test
  public void VAlidateusername() throws IOException 
  {
	String ActuauserlID = HOME.getActulUserID();
	String expectedUSerid = UtilityUsingProperties.readDatafromProperty("UN");
	Assert.assertEquals(ActuauserlID, expectedUSerid,"Actual user id is not matching to Expected User id, Test Case is failed");
 Reporter.log("Actual user id is  matching to Expected User id, Test Case is passed",true);
 
 UtilityUsingProperties.takeScreenshot(driver);
 
 
  }
  @AfterMethod
  public void logOUT() throws InterruptedException
  {
	  HOME.clickOnLogoutButton();
	  Reporter.log("logout from KiteApp",true);
  }
  @AfterClass
  public void close()
  {
	  driver.close();
  }
}
