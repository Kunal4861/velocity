package misceleenious;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetionSearchbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("high");

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

		 List<WebElement> auto = driver.findElements(By.xpath("//ul[@class='desktop-group']/li"));
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		 for(WebElement result:auto) 
		 {
			System.out.println(result.getText());
			String Actual = result.getText();
			String Expected = "High Heel Shoes";
			
//			int count = auto.size();
//			auto.get(count-3).click();
			
			if(Actual.equals(Expected)) {
				
				result.click();
				break;
			}
		}
		
	}

}
