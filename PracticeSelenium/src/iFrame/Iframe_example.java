package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_example {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(200);
		driver.switchTo().frame("frame1");// frame 1
		Thread.sleep(200);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"))); 
		//frame 2 by x path if id or name is not available at that time we need to use xpath
		Thread.sleep(200);
		driver.switchTo().defaultContent();
		Thread.sleep(200);
		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'Sample Nested Iframe page.')]"));
		Thread.sleep(200);
		String actualtext = text.getText();
		Thread.sleep(200);
	
		String expectedtext = "Sample Nested Iframe page. There are nested iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame.";
		
		if (actualtext.equals(expectedtext)) // this way we can compare text during text cases
		{
			System.out.println("text is matching hence true");

		} else {
			System.out.println("text is not matching hence false");

		}

	}
}
