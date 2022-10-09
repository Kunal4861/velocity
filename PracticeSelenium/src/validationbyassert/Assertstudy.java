package validationbyassert;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Assertstudy

{
	//Data members and variable
	@FindBy(xpath="//h1[text()='Welcome To Practice Page']") private WebElement Header;
	@FindBy(id="checkBoxOption2")    private WebElement Checkbox2;
	@FindBy(id="autocomplete")  private  WebElement field;
	
	//constructor
	//2. Initialize within a constructor with access level public using pagefactory 
	
	public Assertstudy(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
		//3. Utilize within a method with access level public
	
	
	

	public void validheader()
	{
		
		 String Actualtext = Header.getText();
		 String expectedtext = "Welcome To Practice Page";
		Assert.assertEquals(Actualtext,expectedtext, "Actualtext is not matching,TC is Failed");
		Reporter.log("Actualtext matching,TC is passed",true);
		
	Assert.assertNotEquals(Actualtext, expectedtext, "Actualtext is  matching,TC is failed");
	}
	
	public void clickoncheckbox()
	
	{
		Checkbox2.click();
		Assert.assertTrue(Checkbox2.isSelected(), "Checkbox is not selected,tc is failed");
	}
		
	public void fieldtext()
	{
		field.getText();
		Assert.assertNull(field, "field is not empty,tc is failed");
	}
}
