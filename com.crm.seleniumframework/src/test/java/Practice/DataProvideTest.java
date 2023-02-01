package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideTest {
	@Test(dataProvider="dataprovider_test")
	public void BookTicket(String src,String dest) 
	{
		System.out.println("Book ticket from "+src+" to "+dest+"" );
	}
@DataProvider 
public Object[][] dataprovider_test()
{
	Object[][] obj=new Object[5][2];
	obj[0][0]="Bangalore";
	obj[0][1]="Belagavi";
	
	obj[1][0]="Bangalore";
	obj[1][1]="Goa";
	
	obj[2][0]="Bangalore";
	obj[2][1]="Delhi";
	
	obj[3][0]="Bangalore";
	obj[3][1]="Goa";
	
	obj[4][0]="Bangalore";
	obj[4][1]="Hyderabad";
	 
	
	return obj;
	
	
}
}
