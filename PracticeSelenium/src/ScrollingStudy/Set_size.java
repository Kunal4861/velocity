package ScrollingStudy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_size {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/selenium-tutorial");
		
		System.out.println(driver.manage().window().getSize());// to get default size of browser
		
		
		//To set size--> use Dimension class and create object of Dimension class
		Dimension d= new  Dimension(1000,200);//create object to set dimension
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());

	}

}
