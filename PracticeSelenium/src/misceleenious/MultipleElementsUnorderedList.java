package misceleenious;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ProtocolHandshake.Result;

import net.bytebuddy.implementation.EqualsMethod;

public class MultipleElementsUnorderedList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nexon ev");

		// find element for list
		 List<WebElement> searchresult = driver.findElements(By.xpath("(//ul[@role='listbox'])[2]//li"));

		for (WebElement search : searchresult) {
			System.out.println(search.getText());// get text of element

		}

		
		
		// to click on required search
		String expectedresult = "nexon ev max price";// required result from list
		for (WebElement result : searchresult) // for each loop
		{
			String actualresult = result.getText();// rout through list
			if (actualresult.equals(expectedresult))// once reach to expected result
			{
				result.click();// click on expected result
				break;// it will stop further search
			}

			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		}

		driver.findElement(By.partialLinkText("Ima")).click();// click on image
	}

}
