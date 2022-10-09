package xmlstudytestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
 
	@Test
  
  public void method1() 
  {
	  Reporter.log("method1 is running",true);
  }
	 
	@Test(groups="regression")
	  public void method2() 
	  {
		  Reporter.log("method2 is running",true);
	  
  }
	  @Test
	  public void method3() 
	  {
		  Reporter.log("method3 is running",true);
	  }
	  
	  
	  
	  @Test(groups="regression")
	  public void method5() 
	  {
		  Reporter.log("method5 is running",true);
	  }
	  
	  @Test(groups="sanity")
	  public void method4() 
	  {
		  Reporter.log("method4 is running",true);
	  }
}
