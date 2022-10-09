package screen_Shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_shotStudy {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/selenium-tutorial");
		driver.manage().window().maximize();
		Thread.sleep(100);

		// To take screenshot using selenium webdriver,
		// we need to type cast driver object to Takes Screenshot interface.
		// Then we need call function getscreenshotAs(); there we need to pass the
		// argument

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Select path of screenshot to store image
		File destination = new File("F:\\Screenshot\\myscreenshot.png");

//		- To store screenshot in local drive (desired location ), we need to call a method 
//		i.e. copy file () which is present inside fileHandler class.
		// FileHandler.copy (src, newfile("destination path"));

		FileHandler.copy(source, destination);

	}

}
