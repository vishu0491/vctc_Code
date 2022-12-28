package testNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass4 {
  @Test(groups="regression")
  public void p() 
  {
	  Reporter.log("p is running",true);
  }
  @Test
  public void q()
  {
	  Reporter.log("q is running",true);
  }
  @Test(groups="sanity")
  public void r()
  {
	Reporter.log("r is running ",true);  
  }
  
}
