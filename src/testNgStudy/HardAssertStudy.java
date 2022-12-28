package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HardAssertStudy {
  @Test(enabled=false)
  public void TC1() 
  {
	  String ExpectedResult="VCTCPune";
	  String ActualResult="VCTC";
	  
	  Assert.assertNotSame(ActualResult, ExpectedResult, "Result is matching");
	  
	  Reporter.log("TC2 is running ",true);
	  
	  
  }
  @Test
  public void TC2()
  {
	  
  }
}
