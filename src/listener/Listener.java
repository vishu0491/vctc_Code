package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		Reporter.log("test case passed sucessfully",true);
		result.getName();
		Reporter.log("Test method completed sucess is"+result.getName(),true);
	
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("test case failed please check again",true);
		Reporter.log("Name of Test method failed is"+result.getName(),true);
	}
	
	 @Override
	public void onTestSkipped(ITestResult result)
	 {
	    Reporter.log("test case skipped, please check dependant method");
	    Reporter.log("Name Test method skipped  is"+result.getName(),true);
	 }
	

}
