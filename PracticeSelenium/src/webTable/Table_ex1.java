package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_ex1 {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","F:\\Selenium java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(3000);
	    // to print header
	    List<WebElement> tableheader = driver.findElements(By.xpath("//table//th"));// th use to print heading
	    for(WebElement th:tableheader) {
	    	System.out.print(th.getText()+ " || ");// use print instead of println to print in one column
	    }
	    
	    System.out.println();
	    // to find single element ex. Learn JMETER from Scratch - (Performance + Load) Testing Tool
	    
	    WebElement text = driver.findElement(By.xpath("//td[contains (text(),'JMETER') ]"));
	    
         System.out.println(text.getText());
         
	// to print one column
         List<WebElement> column = driver.findElements(By.xpath("//table//tr[5]"));
         for(WebElement c:column) {
        	 System.out.print(c.getText()+ " || ");
         }
         System.out.println();
         // to print all rows with size
         List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
         for(WebElement r:rows) {
        	 System.out.println(r.getText()+"|");
         }
         System.out.println();
         
         System.out.println("total number of rows is "+rows.size());
         
      // to print all column with size
         List<WebElement> column1 = driver.findElements(By.xpath("//table//th"));//use th instead of td
         for(WebElement Cn:column1) {
        	 System.out.print(Cn.getText()+" ||");
         }
         System.out.println();
         
         System.out.println("total number of column is "+ column1.size());
	}
}


