package webTable;

import java.time.Duration;// print entire column
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabl_ex2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	    List<WebElement> numberofrows = driver.findElements(By.xpath(" //tr"));
	    int TotalNumberofrows = numberofrows.size();
	    
	    List<WebElement> numberofcolumns = driver.findElements(By.xpath(" //th"));
	    int TotalNumbeofcolumns = numberofcolumns.size();
	    
	    System.out.println("total number of rows is  "+ TotalNumberofrows);
	    System.out.println("total number of columns is  "+ TotalNumbeofcolumns);
	    	
	    
	    for(int i=1;i<= TotalNumberofrows;i++) //external loop for row
	    {
	    	for(int j=1;j<=TotalNumbeofcolumns;j++) // internal loop for column
	    		{
	    		if(i==1) {
	    			 String text = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//th["+j+"]")).getText();
	    			System.out.print( text +" ||");
	    		}
	    		
	    		else {
	    			String text = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td["+j+"]")).getText();
	    			System.out.print( text +"  ||");
				}
	    	}System.out.println();
	    	
	}

}
}