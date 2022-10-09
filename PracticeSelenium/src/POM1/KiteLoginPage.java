package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	//Data members and variable
	//1. Data member should be declared globally with access level private using @findBy Annotation
	@FindBy(id = "userid") private WebElement UN;
	
	@FindBy(id = "password") private WebElement PWD;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	//constructor
	//2. Initialize within a constructor with access level public using pagefactory 
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	//3. Utilize within a method with access level public
	
	public void sendUserName()
	{
		UN.sendKeys("ELR321");
	}
	public void sendPassword() 
	{
	PWD.sendKeys("Dhana1111");
}
	public void clickOnLogIn() 
	{
		loginButton.click();
	}
	
}	
	
	
	
	
	
	
	
