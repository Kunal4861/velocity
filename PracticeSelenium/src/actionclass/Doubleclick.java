package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mousetester.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		Actions C = new Actions(driver);
		WebElement element = driver.findElement(By.id("clickMe"));

		C.doubleClick(element).perform();// left double click

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		C.contextClick(element).perform();// right click

	}

}
