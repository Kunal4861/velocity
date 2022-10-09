package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class Frame_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		Thread.sleep(300);
		
		driver.switchTo().frame("iframeResult");
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(300);
		
		driver.switchTo().defaultContent();
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		
		
	}

}
