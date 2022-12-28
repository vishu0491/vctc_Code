package verificationInTestNg;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class  AssertTrueUse {
  @Test
  public void myMethod2() 
  {
	  boolean a=true;
	  boolean b=false;
	  
	//  Assert.assertFalse(b,"Tc is passses value is False");
	  
	  Assert.assertFalse(a);
	  Reporter.log("Tc is pased value is false",true);
  }
}
