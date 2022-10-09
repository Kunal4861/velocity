package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_text {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//find x path by text
		driver.get("https://vctcpune.com/");
	Thread.sleep (5000);
	driver.manage().window().maximize();
	Thread.sleep (5000);
	driver.findElement(By.xpath("//a[text()='Velocity Foundation'][1]")).click();
	}

}
