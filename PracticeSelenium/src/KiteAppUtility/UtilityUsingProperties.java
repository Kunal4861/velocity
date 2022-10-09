package KiteAppUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityUsingProperties {
	
	public static void takeScreenshot(WebDriver driver) throws IOException //take static method
	{
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(3);
		 File Destination = new File("F:\\Screenshot\\Sceenshotname"+random+".png");
		FileHandler.copy(Source, Destination);
	}
	
	public static String readDatafromProperty(String key) throws IOException  //provide return type string with parameter String key
	{
		Properties prop=new Properties();
		FileInputStream myprop= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Selenium_newuse\\myProperty.properties");
		prop.load(myprop);//to load file
		
		String value=prop.getProperty(key);//create variable to get value
		return value;//provide return type
		
	
	}
	// create static method
// first create object ofProperties class
	// create fileinput stream object with properties path
	// to load file for reading use prop.load(myprop)
	// to get any key from properties String Value
	// return statement return value
}
