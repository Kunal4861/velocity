package waitIn_selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicit_wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.airtel.in/");
		driver.manage().window().maximize();

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));//delay time using explicit and object w
		
		
		
		
		WebElement loginButton = driver.findElement(By.xpath("//a[@data-analytics='header|Login']"));
																		
																										
		

		wait.until(ExpectedConditions.visibilityOf(loginButton));
		loginButton.click();

	}

}
