package drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box_ex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// 1. Identify list box to be handled and store it in reference variable
		
		driver.findElement(By.xpath("//span[text()='Sign up with phone or email']")).click();
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.id("SELECTOR_2"));
		Thread.sleep(1000);
		// 2. Create an object of Select class which will accept WebElement as argument
		Select s = new Select(day);
//		By using one of the select class methods we can select values form list box like 
//		1. selectByVisibleText: selectByVisibleText(String arg0) 
//		2. selectByIndex: selectByIndex(int arg0) 
//		3. selectByValue: selectByValue(String arg0)

		// using selectByVisibleText
		s.selectByVisibleText("20");
		Thread.sleep(1000);
		// using selectByIndex
		s.selectByIndex(14);
		Thread.sleep(1000);
		// using selectByValue
		s.selectByValue("17");
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.id("SELECTOR_1"));
		Select s1= new Select(month);
		Thread.sleep(1000);
		s1.selectByVisibleText("August");
		Thread.sleep(1000);
		s1.selectByIndex(4);//index value is not given on twitter
		Thread.sleep(1000);
		s1.selectByValue("9");
//		1.	Identify list box to be handled and store it in reference variable
//		2.	Create an object of Select class which will accept WebElement as argument
//		Select s= new Select(States);
//		3.	By using one of the select class methods we can select values form list box like 
//		1. selectByVisibleText: selectByVisibleText(String arg0) 
//		2. selectByIndex: selectByIndex(int arg0) 
//		3. selectByValue: selectByValue(String arg0)


		
	}

}
