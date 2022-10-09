package General_Practice;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionStudy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		Actions Act= new Actions(driver);
		WebElement DoubleClick = driver.findElement(By.id("doubleClickBtn"));
		
		Act.doubleClick(DoubleClick).perform();// for Double click
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement RightClick = driver.findElement(By.id("rightClickBtn"));
		Act.contextClick(RightClick).perform();// for Right click
		
		

	}

}
