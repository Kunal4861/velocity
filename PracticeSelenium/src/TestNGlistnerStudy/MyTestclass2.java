package TestNGlistnerStudy;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNGlistnerStudy.Listener.class)
public class MyTestclass2
{
  @Test
  public void Nashik()
  {
	  Reporter.log("Nashik TC is Running",true);
  }
  @Test
public void Chandrapur()
{
	Reporter.log("Chandrapur TC is Running",true);
}
  
}
//select both class MyTestclass1 and MyTestclass2 and create xml file and provide Listner to xml file instead of class level
