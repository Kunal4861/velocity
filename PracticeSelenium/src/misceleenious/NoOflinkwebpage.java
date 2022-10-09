package misceleenious;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOflinkwebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		// to print all links text
		
//		Iterator<WebElement> it = links.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next().getText());
//			}
		
		
		
		
		
		System.out.println("---------");
		
		
		for( WebElement j:links) {
		System.out.println(j.getText());
		 
		
		}
		
		

	}

}
