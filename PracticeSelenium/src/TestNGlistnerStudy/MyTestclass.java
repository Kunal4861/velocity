package TestNGlistnerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGlistnerStudy.Listener.class)//before class write @Listeners(TestNGlistnerStudy.Listner.class)
                                            //@Listner(packagename.listnerclassname-Listner.class)
public class MyTestclass 

{
  @Test
  public void Nagpur()
  {
	  Reporter.log("Hello orange city",true);
  }
  
  @Test
  public void Pune()
  {
	  Assert.fail();
	  Reporter.log("Hello educational city",true); 
  }
  
  @Test(dependsOnMethods = {"Pune"})
  public void mumbai()
  {
	  Reporter.log("Hello Film city",true);
  }
}
//provide listener at class level
