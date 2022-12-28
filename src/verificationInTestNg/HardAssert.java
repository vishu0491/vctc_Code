package verificationInTestNg;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert {
  @Test
  public void myMethod() {
	  String a="abc";
	  String b="abc";
	  
	  Assert.assertEquals(a, b,"values are not equal TC is failed");
	  Reporter.log("values are equal TC is passed", true);
	  
	  
	  Assert.assertNull(a,"Value is not null");
	  Reporter.log ("Value is null TC passed",true);
  }
}
