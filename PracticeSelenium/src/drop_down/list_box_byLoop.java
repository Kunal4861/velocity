package drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class list_box_byLoop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//u[contains(text(),'new account')]")).click();
		Thread.sleep(1000);
		// 1. Identify list box to be handled and store it in reference variable
		WebElement DOB = driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		// 2. Create an object of Select class which will accept WebElement as argument
		Select s = new Select(DOB);
		
		// write for loop to change values automatically within loop limit

		for (int i = 1; i <= 10; i++) // if selected box begin from 1 that means index is 1, if select box begin with
										// any word then index i 0
		{
			Thread.sleep(1000);
			s.selectByIndex(i);
		}
		for (int i = 10; i >= 0; i--) {
			Thread.sleep(1000);
			s.selectByIndex(i);
		}

	}

}
