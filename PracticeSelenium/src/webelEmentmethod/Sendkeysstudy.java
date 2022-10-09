package webelEmentmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeysstudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
   WebDriver driver= new ChromeDriver();
   driver.get("https://www.facebook.com/");
   Thread.sleep(100);
   driver.manage().window().maximize();
   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kunaldangre");// enter user name
   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kunalkunal");// enter password
   driver.findElement(By.xpath("//button[@value='1']")).click();// click on log in

	}

}
