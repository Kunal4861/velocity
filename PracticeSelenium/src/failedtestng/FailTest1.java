package failedtestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailTest1 {
  @Test
  public void method1() {
	  Reporter.log("method1 is rinning", true);
  }
  
  @Test
  public void method2()
  {
	  Assert.fail();// to fail test case so that we can see it in xml file
	  Reporter.log("method2 is running", true);
  }
  
  
  @Test
  public void method3() {
	  Reporter.log("method3 is running", true);
  }
  
  @Test
  public void method4() {
	  Reporter.log("method4 is running", true);
  }
  
  @Test
  public void method5() {
	  Reporter.log("method5 is running", true);
  }
}
