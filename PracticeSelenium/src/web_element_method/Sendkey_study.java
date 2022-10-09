package web_element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkey_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
                WebDriver driver=new ChromeDriver();
                driver.get("https://www.airtel.in/s/selfcare?normalLogin");
                driver.manage().window().maximize();
                Thread.sleep(1000);
                WebElement Element = driver.findElement(By.xpath("//input[@name='mobileNumber']"));//created reference variable Element to reuse data
                //use send key method to type details in user name box
                 Element.sendKeys("kunaldangre");
                Thread.sleep(1000);
                 //using clear method
                 Element.clear();
	}

	
}
