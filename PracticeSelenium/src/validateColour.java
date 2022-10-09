import java.awt.Button;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class validateColour {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String Buttoncolor = driver.findElement(By.xpath("(//button[@type='submit'])")).getCssValue("background-color");

		System.out.println(Buttoncolor);
		String Imgcolr = Color.fromString(Buttoncolor).asHex();
		
		String Orignalcolor = "#1877f2";
		if (Imgcolr.equals(Orignalcolor)) {
			System.out.println("Background color is matching");
			
		}
		else {
			System.out.println("Background is not matching");
		}
		
		
}
	
}
