package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myseleniumbasic {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","F:\\Selenium java\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=3TkCKxuF7zI");//    to get url
		
		String url = driver.getCurrentUrl();
        System.out.println("current url is " + url);// to get current url
	}

}
