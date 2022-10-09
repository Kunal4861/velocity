package locators; //xpath by attribute

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUse_locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// object
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");// open url in browser
		driver.manage().window().maximize();// maximize window
		Thread.sleep(300);// use to reload webpage completely by providing delay time 100 millisecond
		driver.findElement(By.xpath("//option[@value='option2']")).click();

	}

}
