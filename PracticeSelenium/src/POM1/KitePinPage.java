package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	
	@FindBy(id = "pin") private WebElement PIN;

	
	@FindBy(xpath = "//button[@type='submit']") private WebElement ContinueButton;
	
	//constructor

public KitePinPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	}

	//methods
	public void sendPin() 
	{
		PIN.sendKeys("982278");
	}
	
	public void clickOnContinueButton()
	
	{
		ContinueButton.click();
	}




}