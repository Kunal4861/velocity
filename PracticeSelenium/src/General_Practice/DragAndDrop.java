package General_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement Destination = driver.findElement(By.id("droppable"));
		
		Actions Act= new Actions(driver);
		Act.dragAndDrop(Source, Destination).perform();//drag and drop
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement move = driver.findElement(By.id("droppableExample-tab-accept"));
		
	Act.moveToElement(move).perform();
	}

}
