package TestNGlistnerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
//class name must be Listner
public class Listener implements ITestListener //Listener class Implement ITestlisner Interface
{
//	ontestSUCESS
//	ontestfail
//	ontestfailure
//	ontestskip
//
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Test Case is Failed", true);
		Reporter.log("failed test case name is " +result.getName(),true);//to get name of failed test case on report
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("Test Case is Passed", true);
		
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("Test Case is skipped,please check dependent Test Case", true);
		Reporter.log("skipped test case name is " +result.getName(),true);//to get name of skipped test case
        ITestListener.super.onTestSkipped(result);
	}
	

}
