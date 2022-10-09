package xmlstudytestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 
{
	@Test(groups = "sanity")
	  public void method6() 
	  {
		  Reporter.log("method6 is running",true);
	  }
		  
	@Test(groups="regression")
		  public void method7() 
		  {
			  Reporter.log("method7 is running",true);
		  
	  }
		  @Test
		  public void method8() 
		  {
			  Reporter.log("method8 is running",true);
		  }
		  
		  
		  
		  @Test(groups="regression")
		  public void method9() 
		  {
			  Reporter.log("method9 is running",false);
		  }
		  
		  @Test
		  public void method10() 
		  {
			  Reporter.log("method10 is running",true);
		  }
	}
