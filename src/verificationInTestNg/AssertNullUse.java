package verificationInTestNg;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullUse {
  @Test
  public void myMethod() {
	  String a=null;
	  String b="abc";
	  
	  //if text is null then Tc is passed
	  Assert.assertNull(a,"Tc is failed value is not null");
	  Reporter.log("Tc is passed value is not null",true);
	  
  }
}
