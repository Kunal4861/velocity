package misceleenious;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nexon ev");

driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

	List<WebElement> a = driver.findElements(By.xpath("(//ul[@role='listbox'])[2]//li"));
	
	 	
	for(WebElement b:a) {
		 String exp= "nexon ev max price";
		
		 String act=b.getText();
		 
		 if(act.equals(exp)) {
			 b.click();
			 break;
			 
		 }
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		 
	 }
		 
	

	}

}
