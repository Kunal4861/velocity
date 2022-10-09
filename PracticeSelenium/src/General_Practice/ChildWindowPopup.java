package General_Practice;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	
	driver.manage().window().maximize();
	 
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	
	driver.findElement(By.id("messageWindowButton")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
	
 Set<String> WinId = driver.getWindowHandles();// getWindowHandles provide id of mani page and other pages also
	
	//Set<String>WinId= driver.getWindowHandle();// it will provide Id of only main page
	
	// we cannot iterate through set so converting set into arraylist
	
	ArrayList<String>arl=new ArrayList<String>(WinId);
	
	
	
	System.out.println(arl.get(0));//Id of mainpage
	
	System.out.println(arl.get(1));//Id of childBrowser
//	
//	// we need to swich focus from main page to child browser also we can use for loop for multiple id
//	for(int i=0;i<=arl.size()-1;i++) {
//	System.out.println(arl.get(i));
//}

	String MainPage = arl.get(0);
	 String childpage = arl.get(1);
	 
	driver.switchTo().window(childpage);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	// to get back to mani page
	driver.switchTo().window(MainPage);
	
	
	
	
	}

}
