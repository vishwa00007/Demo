package Practice;

import org.testng.annotations.Test;

public class Sample1 {
	@Test(invocationCount=0)
	public void createcustomer()
	{
		System.out.println("customer created");
	}
	@Test
	public void modifycustomer()
	{
		System.out.println("customer modified");
	}
	@Test(dependsOnMethods="createcustomer")
	public void deletecustomer()
	{
		System.out.println("customer deleted");
	}



}
