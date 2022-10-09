package General_Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
	File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String random = RandomString.make(4);
	
	File Destination=new File("F:\\Screenshot\\myscreenshot"+random+".png");
	
    org.openqa.selenium.io.FileHandler.copy(Source, Destination);

	}

}
