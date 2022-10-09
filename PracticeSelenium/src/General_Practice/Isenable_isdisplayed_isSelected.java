package General_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//isDisplay(); is used to validate image or text present on webpage
//isEnable(); is used to link are available  or not
//isSelected(); is used to check element is clickable/selected  or not

public class Isenable_isdisplayed_isSelected {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		// isDisplay
		WebElement text = driver.findElement(By.xpath("(//label[@class='form-label'])[1]"));
		

		if ( text.isDisplayed()) {
			System.out.println("text is present on Webpage");

		}

		else {
			System.out.println("text is not  present on Webpage");

		}

		// Isenable

		WebElement linkSubmit = driver.findElement(By.id("submit"));
		boolean result1 = linkSubmit.isEnabled();
		System.out.println(result1);

		Thread.sleep(2000);

		// Isselected
		driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement sel = driver.findElement(By.id("checkBoxOption1"));
		sel.click();
		System.out.println(sel.isSelected());
	
		
//		if(sel.isSelected())
//		{
//			System.out.println("checkbox is already selected");
//		}
//		else {
//			System.out.println("select checkbox now");
//		}
//		sel.click();
//		
//		if(sel.isSelected())
//		{
//			System.out.println("checkbox is already selected");
//		}
//		else {
//			System.out.println("not selected");
//		}
	}
}
