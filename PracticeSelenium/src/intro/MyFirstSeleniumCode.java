package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumCode {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium java\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.flipkart.com/");// to open url in browser 1.
		
		//driver.close();//to close current tab  2.
		//driver.quit();//to close all tab        3.
		driver.manage().window().maximize();// to maximize browser  4.
		
		//driver.manage().window().minimize(); // to minimize browser //before selenium 4.1 minimize option was not available 5.
		//driver.navigate().to("https://www.amazon.in/");// to navigate from one url to selected url from same tab 6.
		//driver.navigate().back();// to navigate back to  url from navigated url from same tab   7.
		
		//driver.navigate().forward(); // to navigate forward to  url from navigated url from same tab 8.
		//driver.navigate().refresh();// to refresh current page on browser  9.
		
		
		//driver.get("https://vctcpune.com/");// to get url
		                                   
		String url = driver.getCurrentUrl();// to get current url
		System.out.println("Url is "+url);

		
	}

}
