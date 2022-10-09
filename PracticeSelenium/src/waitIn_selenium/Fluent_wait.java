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

public class Fluent_wait { //it is same like explicit only it increase frequency of finding element

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.airtel.in/");
		driver.manage().window().maximize();

	
		WebElement loginButton = driver.findElement(By.xpath("//a[@data-analytics='header|Login']"));// locate
																										// webelement
		Wait<WebDriver>	wait=new FluentWait<WebDriver>(driver)																							
				.withTimeout(Duration.ofMillis(5000))	
				.pollingEvery(Duration.ofMillis(1000))
				.ignoring(NoSuchElementException.class);																								// and create
																	
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		loginButton.click();

		
	

	}

}
