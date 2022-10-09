package kiteAppBaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppBaseClasses
{
protected WebDriver driver;//provide webdriver access specifier as private(imp. step)

public void openBrowser()
{
	System.setProperty("webdriver.chrome.driver","F:\\Selenium java\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}

}
