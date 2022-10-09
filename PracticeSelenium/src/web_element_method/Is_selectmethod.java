package web_element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selectmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.id("checkBoxOption1"));
		if(element.isSelected())
		{
			System.out.println("checkbox is already selected");
		}
		else {
			System.out.println("select checkbox now");
		}
		element.click();
		if(element.isSelected())
		{ System.out.println("checkbox is  selected");
}
		else
		{
			System.out.println("checkbox is not selected");
}
}
}