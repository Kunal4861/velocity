package Popup_Study;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();// create alert variable
		System.out.println("alert text message is - " + alert.getText());
		Thread.sleep(5000);
		alert.accept();// to accept alert
		
//    alert.dismiss();// to cancel alert

	}

}
