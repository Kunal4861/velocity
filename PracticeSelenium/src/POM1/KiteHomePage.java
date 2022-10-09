package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Data members and variable
public class KiteHomePage 
{
	
@FindBy(xpath="//span[@class='user-id']")   private WebElement UserID;
@FindBy(xpath="//a[@target='_self']") private WebElement  LogoutButton;



//constructor
public KiteHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}	

//methods
public void validateUserID() //validating(checking) userid
{ 
	String actualresult = UserID.getText();
	String Expectedresult = "ELR321";
	if(actualresult.equals(Expectedresult))
	{ System.out.println("UserID is matching, Test case is pass");
}
	else {
		System.out.println("UserID is not matching, Test case is failed");
	}
		
	}
public void clickOnlogoutButton() throws InterruptedException
{
UserID.click();
Thread.sleep(200);

LogoutButton.click();


}
	
}
