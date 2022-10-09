package waitIn_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait_java {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		// Thread.sleep(6000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));//implicit wait 
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();

	}
}
