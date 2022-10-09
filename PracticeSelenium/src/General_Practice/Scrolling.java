package General_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://smallseotools.com/plagiarism-checker/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
	WebElement upload = driver.findElement(By.xpath("//span[text()='Upload File']"));
		JavascriptExecutor j= ((JavascriptExecutor) driver);//typecast
		
		
		j.executeScript("arguments[0].scrollIntoView(true);", upload);
		
		
	
		
		
	
	
	

	}

}
