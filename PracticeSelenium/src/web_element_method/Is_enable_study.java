package web_element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_enable_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.freecharge.in/?cid=PS&utm_source=google&utm_medium=paid&utm_campaign=fc_sok_sem_reach_na_rma_web_in000_cc000_brand_NUTS&cid=PS&utm_source=google&utm_medium=paid&utm_campaign=fc_sok_sem_reach_na_rma_web_in000_cc000_brand_NUTS&gclid=CjwKCAjw682TBhATEiwA9crl3442fZHW6orKSpcYvAnvpX7rvimJslVb7lhhggy6-i8iW5opq8OZ0BoCtgEQAvD_BwE");
        Thread.sleep(1000);
        WebElement login = driver.findElement(By.xpath ("//span[contains(text(),'login')]"));
      
        System.out.println(login.isEnabled());
	}

	
}
