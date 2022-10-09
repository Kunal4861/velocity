package General_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// we can find frame by id, name ,xpath and by index

public class IframePractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");// switching selenium focus from main page to frame1
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		// switching selenium focus from frame1 to frame2
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		
//we can move selenium focuse from frame 2 to its immigiate parent i.e. frame1
		
		driver.switchTo().parentFrame();
		// also we can move selenium focus from frame2 to default page
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		String text = (driver.findElement(By.xpath("//div[contains(text(),'There are nested iframes in this page')]"))).getText();
		System.out.println(text);
		
	}

}
