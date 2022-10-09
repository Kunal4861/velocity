package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_use {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement textbox = driver.findElement(By.id("autocomplete"));
		//textbox.sendKeys("kunal");
		
		Actions Act= new Actions(driver);
		//Act.sendKeys(textbox, "nagpur").perform();// we can perform this way also
		
		
		//Act.keyDown(textbox, Keys.SHIFT).sendKeys("nagpur").perform();//to change nagpur from lowercase to uppercase
		
		Act.keyDown(textbox, Keys.SHIFT).sendKeys("n").keyUp( Keys.SHIFT).sendKeys("agpur").build().perform();
// to print n in upper case and remaining in lower case

	}

}
