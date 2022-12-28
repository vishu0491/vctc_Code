package verificationInTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void myMethod() {
	  
	  String a="abc";
	  String b="null";
	  
	  SoftAssert soft=new SoftAssert();// created object of soft assert
	  
	  soft.assertEquals(a,b,"TC is faild values are not matching");
	 // Reporter.log("Tc is passed values are matching",true);
	  
	  soft.assertNotNull(b,"Tc is failed value is null");
	 // Reporter.log("Tc is passed value is null",true);
	  
	  soft.assertAll();
	  
	 
	  
	  
	  
  }
}
