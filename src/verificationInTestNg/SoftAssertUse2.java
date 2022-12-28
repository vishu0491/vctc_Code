package verificationInTestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class  SoftAssertUse2 {
  @Test
  public void myMethod() 
  {
	  String a="abc";
	  String b="abc";
	  
	  //to use of soft assert we need to creat object of soft assert class
	  
	  SoftAssert soft =new SoftAssert();
	  
	  soft.assertNotEquals(a, b,"Both are equal Tc is failed");
	  soft.assertNull(b, "Value is not null,tc is failed");
	  
	  soft.assertAll();
  }
  @Test
  public void testing()
  {
	 boolean a=true;
	 boolean b=false;
	 
	 SoftAssert s=new SoftAssert();
	 
	 s.assertTrue(b,"value is false Tc is Failed");
	 s.assertFalse(a, "value is True tc is Failed");
	 
	 s.assertAll();
  }
}
