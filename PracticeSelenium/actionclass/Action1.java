package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		Actions C = new Actions(driver);// Select actions webdriver

		WebElement myelement = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		// to move courser to targeted element
		C.moveToElement(myelement).perform();

		// to click on selected element
		C.click(myelement).perform();

		// to right click on selected element
		C.contextClick(myelement).perform();

		// to drag and drop
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

		C.dragAndDrop(source, destination).perform();

	}

}
