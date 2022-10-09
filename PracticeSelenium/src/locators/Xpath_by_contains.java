package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_contains {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium java\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/hz/wishlist/intro");
    driver.manage().window().maximize();
    Thread.sleep(1000);
    //	Contains with text() 
// driver.findElement(By.xpath("//h3[contains(text(),'Check')]"));// we can also write only word from original text value
   
   
   //	Contains with attribute 
   
   driver.findElement(By.xpath("//span [contains (@class,'a-size-small')]"));// we can also write only word from original attribute value
   
	}

}
