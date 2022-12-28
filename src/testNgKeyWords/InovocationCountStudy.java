package testNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InovocationCountStudy {
  @Test(invocationCount=3)
  public void a() 
  {
	  Reporter.log("a mention is runnig",true);
  }
  
  @AfterMethod 
  public void afterMethod()
  {
	  Reporter.log("after method is runnig",true);
  }
  
}
