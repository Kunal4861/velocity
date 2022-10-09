package failedtestng;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failedtest2 {
  @Test
  public void method6() {
	  Reporter.log("method6 is running", true);
  }
  
  @Test
  public void method7() 
  
  {
	 //Assert.fail();// to fail test case so that we can see it in xml file
	  Reporter.log("method7 is running", true);
  }
  
  
  @Test
  public void method8() {
	  Reporter.log("method8 is running", true);
  }
  
  @Test
  public void method9() {
	  Reporter.log("method9 is running", true);
  }
  
  @Test
  public void method10() {
	  Reporter.log("method10 is running", true);
  
  }
}
