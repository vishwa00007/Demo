package com.crm.Generic_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.crm.Objectrepository.Loginpage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass 
{
	public WebDriver driver;
	public static WebDriver edriver;
	@BeforeSuite(groups = {"SmokeTest","RegressionTest"})
public void BS() {
	System.out.println("Database connection");
}
@BeforeTest(groups = {"SmokeTest","RegressionTest"})
public void BT() {
	System.out.println("Execute in parallel mode");
}

//@Parameters("BROWSER")
@BeforeClass
(groups = {"SmokeTest","RegressionTest"})
//public void BC() throws Throwable 
public void BC(String BROWSER) throws Throwable 
{
	
	
	File_utility fib=new File_utility();

	Webdriver_utility wu=new Webdriver_utility();
	String BROWSER1 = fib.getPropertyKeyValue1("BROWSER");
	
	if(BROWSER1.equalsIgnoreCase("chrome")) 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	else if(BROWSER1.equalsIgnoreCase("firefox")) 
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else if(BROWSER1.equalsIgnoreCase("edge")) 
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	else 
	{
		driver=new ChromeDriver();
	}
	edriver=driver;
	wu.Windowmax(driver);
	wu.WaitForElement(driver);
	System.out.println("Launching the browser");
	}
	
   @BeforeMethod(groups = {"SmokeTest","RegressionTest"})
   public void BM() throws Throwable {
	File_utility fib=new File_utility();
    String URL = fib.getPropertyKeyValue1("url");
	String username =fib.getPropertyKeyValue1("un");
	String password = fib.getPropertyKeyValue1("pw");
	
	driver.get(URL);
	
	Loginpage login=new Loginpage(driver);
	login.login(username, password);
	
	System.out.println("Login to application");
	
}
@AfterMethod(groups = {"SmokeTest","RegressionTest"})
public void AM() {
	System.out.println("Logout the application");
}
@AfterClass(groups = {"SmokeTest","RegressionTest"})
public void AC() {
	
	System.out.println("Closing the browser");
}
@AfterTest(groups = {"SmokeTest","RegressionTest"})
public void AT() {
	System.out.println("Execution complete");
	driver.quit();
}
@AfterSuite(groups = {"SmokeTest","RegressionTest"})
public void AS() {
	System.out.println("End database connection");
	
}
}
