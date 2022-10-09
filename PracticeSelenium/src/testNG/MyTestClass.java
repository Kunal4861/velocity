package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
	@Test
	public void myMethod1() {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		
		
		

		
	
		 ChromeOptions opt= new ChromeOptions();
         opt.addArguments("--incognito");
         WebDriver driver = new ChromeDriver(opt);
         
		
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		System.out.println("myMethod1 is running");
	}
	
	@Test
	public void myMethod2() {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
        opt.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(opt);
		
	
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Reporter.log("myMethod2 is running");
	}
	
	@Test
	public void myMethod3() {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		
		ChromeOptions opt= new ChromeOptions();
        opt.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Reporter.log("myMethod3 is running", true);
	}
}
