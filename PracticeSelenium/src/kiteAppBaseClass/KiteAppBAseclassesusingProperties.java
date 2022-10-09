package kiteAppBaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import KiteAppUtility.UtilityUsingProperties;

public class KiteAppBAseclassesusingProperties {
	protected WebDriver driver;//create Webdriver driver protected
	public void openBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium java\\chromedriver.exe");
				
		      driver= new ChromeDriver();
				
			   driver.get(UtilityUsingProperties.readDatafromProperty("URL"));//from properties using utility
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

	}


