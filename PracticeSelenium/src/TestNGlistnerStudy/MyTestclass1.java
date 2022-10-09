package TestNGlistnerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGlistnerStudy.Listener.class)

public class MyTestclass1 {
  @Test
  public void Satara() 
  {
	  Reporter.log("Satara TC is Running",true);
  }
  
  @Test
  public void Wardha()
  
  {
	  Assert.fail();
	  Reporter.log("Wardha TC is Running",true);
  }
}
