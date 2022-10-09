package kite_with_Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Pin_Page {
	// data members/variables
	
	@FindBy(id="pin")  private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']") private WebElement ContinueButton;

	//constructor
	public Kite_Pin_Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void Sendpin(String pin)
	{
		PIN.sendKeys(pin);
	}
	
	public void ClickOnCountinueButton()
	{ 
		ContinueButton.click();
	}
}
