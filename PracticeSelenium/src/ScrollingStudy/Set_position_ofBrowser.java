package ScrollingStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

public class Set_position_ofBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/file-upload-in-selenium");
		Thread.sleep(2000);
		driver.manage().window().getPosition();
		System.out.println(	driver.manage().window().getPosition());
		
		//To set Position--> use Point class and create object of Point class

		org.openqa.selenium.Point p= new org.openqa.selenium.Point(100, 80);
		driver.manage().window().setPosition(p);
		System.out.println(	driver.manage().window().getPosition());

	}

}
