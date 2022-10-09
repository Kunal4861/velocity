package General_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeayboardShift {
                                                                                               
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		Actions Act= new Actions(driver);
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		Act.keyDown(text,Keys.SHIFT).sendKeys("B").keyUp(Keys.SHIFT).sendKeys("anglore").perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		List<WebElement>Searchoptions= driver.findElements(By.xpath("(//ul[@role='listbox'])[2]//li"));
		
		for(WebElement search:Searchoptions) {
			
			
			
			System.out.println(search.getText());
			
			
			
		}
		
		String Expectedresult="bangalore to nagpur train";
		
for(WebElement search:Searchoptions) {
			
			
			
			String actual = search.getText();
			
			if(actual.equals(Expectedresult)) {
				search.click();
				break;
			}
			
			
			
		}
		

	}

}
