package web_element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_text_methodstudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.airtel.in/s/selfcare?normalLogin");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement TEXT = driver.findElement(By.xpath("//span[contains(text(),'PASSWORD')]"));//created refferance variable
		
		String actualtext= TEXT.getText();// created reference variable
		System.out.println(actualtext);
		 String expectedtext = "CLICK TO GET ONE TIME PASSWORD (OTP)";
		
		if (actualtext.equals(expectedtext)) //  this way we can compare text during text cases
		{
			System.out.println("text is matching hence true");
			
		} else {
			System.out.println("text is not matching hence false");

		}
	}

}
