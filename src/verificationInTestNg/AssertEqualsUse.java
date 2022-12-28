package verificationInTestNg;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class  AssertEqualsUse {
  @Test
  public void myMethod() 
  {
	  String a="Pune";
	  String b="Pune";
	  
	//  Assert.assertEquals(a,b,"actual and expected are not equal");
	  Assert.assertNotEquals(a,b,"actual and expected are equal");
	  Reporter.log("actual and expected are not equal,Tc is passes",true);
	  
	  
  }
}
