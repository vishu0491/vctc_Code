package listener;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.Listener.class)
public class Mytest {
  @Test
  public void myMethod1() {
	  Reporter.log("MyMethod1 is running",true);
  }
  @Test
  public void myMethod2()
  {
	  Assert.fail();
	  Reporter.log("MyMethod2 is running",true);
  }
  @Test(dependsOnMethods = {"myMethod2"})
  public void myMethod3()
  {
	  Reporter.log("MyMethod3 is running ",true);
  }
}
