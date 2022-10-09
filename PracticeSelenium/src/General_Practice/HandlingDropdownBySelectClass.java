package General_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownBySelectClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		WebElement option = driver.findElement(By.id("dropdown-class-example"));//create reference variable of selected element
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));    
		//while creating object of select class pass it as parameter
		Select sel=new Select(option);
		
		sel.selectByValue("option2");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));    
		
		sel.selectByVisibleText("Option1");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));    
		
		sel.selectByIndex(3);
		//By loop
		Thread.sleep(2000);
		for(int i=1;i<=3;i++) {
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		for(int i=3;i>=0;i--) {
			
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		
		
	}

}
