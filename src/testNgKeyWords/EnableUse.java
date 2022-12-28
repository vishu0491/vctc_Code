package testNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableUse {
  @Test
  public void a()
  {
	  Reporter.log("a is runnig",true);
  }
  @Test(enabled=false)
  public void b()
  {
	  Reporter.log("b is running ",true);
  }
  @Test
  public void c()
  {
	  Reporter.log("c is running ",true);
  }
}
