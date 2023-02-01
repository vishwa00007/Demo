package Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest 
{
	@Test
public void createCustomer() 
	{
		
	System.out.println("step1");
	System.out.println("step2");
	
	SoftAssert s=new SoftAssert();
	s.assertEquals("B", "B");
	
	System.out.println("step3");
	System.out.println("step4");
	s.assertAll();
}
}