package kite_with_Excel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_LogIN_Page {
	// data members/variables
	
	@FindBy(id="userid") private WebElement UN;
	@FindBy(id="password")  private WebElement PWD;
	@FindBy(xpath="//button[@type='submit']") private WebElement Loginbutton;
	
	
	//constructor
	public Kite_LogIN_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//methods
	public void SendUserName(String Username)//give parameter string username
	                                         //if we want to provide value from excel to page then we use parameter to method e.x.-public void SendUserName(String Username)
	{
		UN.sendKeys(Username);//put string value in sendkeys i.e. string=Username or simply put action taken for element and then add  parameter to method
	}
	
	public void SendPassword(String Password) //give parameter string pwd
	{
		PWD.sendKeys(Password);//put string value in sendkeys
	}
	public void ClickonLogInButton()
	{
		Loginbutton.click();
	}
}
