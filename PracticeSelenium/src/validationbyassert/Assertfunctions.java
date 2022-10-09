package validationbyassert;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Assertfunctions {
	
	



    WebDriver driver;
	Assertstudy AS;
	@BeforeMethod
	public void launchVCTC()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	 AS= new Assertstudy(driver);
	}
 
	@Test
 
  public void assertEquals() 
 {
		 //Assert Equal	
		AS.validheader();
 }
	
	@Test
	public void asserttrue() {
		AS.clickoncheckbox();
	}

	@Test
	public void assertnull() 
	
	{
	AS.fieldtext();
	}
	
}
