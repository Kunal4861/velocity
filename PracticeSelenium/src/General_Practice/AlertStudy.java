package General_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement Button = driver.findElement(By.id("confirmButton"));
		
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Button.click();
		
		driver.switchTo().alert().accept();// you can accept it 
		 //driver.switchTo().alert().dismiss();// you can cancel it 
		//alert popup are colourless

	}

}
