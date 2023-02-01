package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert 
{
	@Test
public void createCustomer() 
{
	System.out.println("step1");
	System.out.println("step2");
	
	Assert.assertEquals("A", "B");
	
	System.out.println("step3");
	System.out.println("step4");
}
	@Test
	public void modifyCustomer() 
	{
		System.out.println("step5");
		System.out.println("step6");
		System.out.println("step7");
	}
}
