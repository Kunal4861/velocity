package zarodhaPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zarodha_kite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\\\Selenium java\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.id("userid")).sendKeys("ELR321");
		driver.findElement(By.id("password")).sendKeys("Dhana1111");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.id("pin")).sendKeys("982278");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		
		WebElement userid = driver.findElement(By.xpath("//span[text()='ELR321']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		String actualuserid = userid.getText();
		String expecteduserid = "ELR321";
		if(actualuserid.equals(expecteduserid))
		{
			System.out.println("userid is matching,testcase is passed");
		}
		else {
			System.out.println("userid is not matching,testcase is failed");
		}
		
		
		userid.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		Thread.sleep(1000);
		driver.close();
	}   

}
