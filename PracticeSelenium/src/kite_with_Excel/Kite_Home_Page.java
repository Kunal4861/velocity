package kite_with_Excel;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_Page
{
	// data members/variables
	
	@FindBy(xpath="//span[@class='user-id']") private WebElement Userid;
	@FindBy(xpath="//a[@target='_self']") private WebElement Logout;
	@FindBy(xpath="//a[text()='Change user']") private WebElement ChangeUser;


	
	//constructor
	public Kite_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void ValidateUserid(String user)//provide parameter as string user
	{
		String actualuserid = Userid.getText();
		String expecteduserid = user;//type user
		
	if(actualuserid.equals(expecteduserid))
	{
		System.out.println("Username is matching,TC is pass");
	}
	else {
		System.out.println("Username is not  matching,TC is failed");
	}
		
}
	//method for testng
	public String ValidateUserid1()//provide parameter as string user(made for Kite_TestNG_with_excell )
	{
		String actualuserid = Userid.getText();
		return actualuserid;
	}
	
	public void ClickOnLogOutButton() throws InterruptedException
	{
		Userid.click();
		Thread.sleep(2000);
	Logout.click();
		
	
}
	public void ChangeUser() 
	{
		ChangeUser.click();
	}
}