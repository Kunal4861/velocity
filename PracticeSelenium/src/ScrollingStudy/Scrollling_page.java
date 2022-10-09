package ScrollingStudy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollling_page {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.airtel.in/");
		Thread.sleep(2000);
		JavascriptExecutor J = ((JavascriptExecutor)driver);//typecast 
        J.executeScript("window.scrollBy(80,2000)");// to scroll
  
        
           // +ve x value--> right hand side, Y value +ve --> down 
     		// +ve x value--> right hand side, Y value -ve --> up 
     		// -ve x value--> left hand side, Y value +ve --> down 
     		// -ve x value--> left hand side, Y value -ve --> up 
        
        
        

	}

}
