package POM1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		KiteLoginPage SignIn= new KiteLoginPage(driver);// KiteLogInPage class object created 
		
		SignIn.sendUserName();//calling methods of KiteLoginPage  class
		SignIn.sendPassword();
		SignIn.clickOnLogIn();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		KitePinPage P=new KitePinPage(driver);
		P.sendPin();
		P.clickOnContinueButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		KiteHomePage Home=new KiteHomePage(driver);
		
		Home.validateUserID();
		Home.clickOnlogoutButton();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.close();

				

	}
	

}
