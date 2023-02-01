package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductDemo {
	

	public static void main(String[] args) throws IOException {
		String key="webdriver.chrome.driver";
		String value="./chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
		FileInputStream fis=new FileInputStream("./commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String Url = p.getProperty("url");
		String username = p.getProperty("un");
		String password = p.getProperty("pw");
		System.out.println(username);
		System.out.println(password);
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath(".//a[text()='Products']")).click();
		driver.findElement(By.xpath(".//img[@title='Create Product...']")).click();
		
		FileInputStream fs=new FileInputStream("./workbook.xlsx");
		Workbook wb=WorkbookFactory.create(fs);
		String data = wb.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.name("productname")).sendKeys(data);
		driver.findElement(By.xpath(".//input[@title='Save [Alt+S]']")).click();
		driver.findElement(By.xpath(".//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath(".//a[text()='Sign Out']")).click();
	}

}
