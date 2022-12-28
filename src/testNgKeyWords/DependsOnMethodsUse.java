package testNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsUse {
  @Test
  public void d() 
  {
	  Reporter.log("d method is running",true);
  }
  
  @Test(dependsOnMethods= "a")
  public void z()
  
  {
	  
	  Reporter.log("z method is runnig ",true);
  }
  
  @Test //(dependsOnMethods= {"z","d"},priority=-3)
  public void a()
  
  {
	  Reporter.log("a method is running ",true);
  }
}
