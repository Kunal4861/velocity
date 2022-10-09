package web_element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_dispalyed_method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(200);
		WebElement textdata = driver.findElement(By.id("displayed-text"));
		boolean result = textdata.isDisplayed();
		System.out.println("text box status is " +result);
	 driver.findElement(By.id("hide-textbox")).click();
		 boolean result1 = textdata.isDisplayed();

		System.out.println("text box status is " +result1);
	}

}
