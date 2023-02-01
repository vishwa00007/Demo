package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderdemo 
{
	@Test(dataProvider="dataProvider_test")
	public void companyDetails(String name, String phone, String mail) throws Throwable {
		String key="webriver.chrome.driver";
		String value="chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		driver.findElement(By.name("firstname")).sendKeys(name);
        driver.findElement(By.id("mobile")).sendKeys(phone);
        driver.findElement(By.id("email")).sendKeys(mail);
        
        driver.quit();
        Thread.sleep(2000);
        
	}
	@DataProvider
	public Object[][] dataProvider_test()
	{
		Object[][] obj=new Object[3][3];
		
		obj[0][0]="Vishwanath";
		obj[0][1]="9739842384";
		obj[0][2]="Vishu@gmail.com";
		
		obj[1][0]="Abhayant";
		obj[1][1]="8904255627";
		obj[1][2]="abhi@gmail.com";
		
		obj[2][0]="sanju";
		obj[2][1]="9874563321";
		obj[2][2]="sanjugmail.com";
		;
		return obj;
		
	}
	
}
