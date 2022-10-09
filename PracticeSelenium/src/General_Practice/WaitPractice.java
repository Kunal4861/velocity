package General_Practice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://vctcpune.com/");
		// Implicit wait wait until all the elements present on the page get loaded
		// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

		// explicit wait wait until selected element visible,once visible

		// it will perform action immitially on require element without waiting for
		// other elements to be loaded
		WebElement practice = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
  //		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(2));
       //		w.until(ExpectedConditions.visibilityOf(practice)).click();

		// The fluent wait will check frequently until the required element is visible,
		// once visible it will perform action
		// FluentWait instance defines the maximum amount of time to wait for a
		// condition,
        //as well as the frequency with which to check the condition.
		
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(20000))
				                  .pollingEvery(Duration.ofMillis(2000))
				                  .ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOf(practice)).click();

	}

}
