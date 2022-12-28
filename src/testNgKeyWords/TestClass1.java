package testNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {
  @Test
  public void p() 
  {
	  Reporter.log("p is running",true);
  }
  @Test
  public void q()
  {
	  Reporter.log("q is running ",true);
  }
  @Test
  public void r()
  {
	  Reporter.log("r is running",true);
  }
}
