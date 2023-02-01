package Practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.Generic_utility.File_utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserdemo {

	public static void main(String[] args) throws Throwable {
		File_utility fib=new File_utility();
		String Browser1 = fib.getPropertyKeyValue1("Browser");
		WebDriver driver;
		
		if(Browser1.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(Browser1.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(Browser1.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		

	}

}
