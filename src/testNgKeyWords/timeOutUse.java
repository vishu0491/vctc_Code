package testNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

 public class timeOutUse {
  @Test(timeOut=2000)
  public void d() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  Reporter.log("d method runnig ",true);
  }
  
  @Test
  public void z() throws InterruptedException
  
  {
	 //Thread.sleep(3000);
	 Reporter.log("z method is running",true);
  }
  @Test
  public void a()
  {
	  Reporter.log("a method is running ",true);
  }
}
