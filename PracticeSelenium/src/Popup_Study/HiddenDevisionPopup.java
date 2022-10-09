package Popup_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;// it can be inspect normally// it is colorful and locator start with div

public class HiddenDevisionPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();// we can inspect it normally without swithching focus
                                                                                     // hidden division popup is colourful
     
	}

}
