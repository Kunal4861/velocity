package ScrollingStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_to_SelectedElement {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://artoftesting.com/selenium-tutorial");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
			WebElement element = driver.findElement(By.xpath("//a[text()='Finding web elements in Selenium']"));// element upto which scroolling should be done
			JavascriptExecutor J = ((JavascriptExecutor)driver);//typecast
			Thread.sleep(2000);
			
			J.executeScript("arguments[0].scrollIntoView(true);", element);

	}

}
