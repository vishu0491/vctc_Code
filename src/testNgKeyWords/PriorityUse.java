package testNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
  @Test(priority=1)
  public void d() 
  {
	  Reporter.log("d method is runnig",true);
  }
  @Test(priority=2)
  public void z()
  {
	  Reporter.log("z method is running ", true);
  }
  @Test(priority=2)
  public void a()
  {
	  Reporter.log("a method is running",true);
  }
  
  
}
