package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

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

FileInputStream fis1=new FileInputStream("./workbook.xlsx");
Workbook wb=WorkbookFactory.create(fis1);
String data = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
System.out.println(data);
driver.findElement(By.xpath("//a[text()='Organizations']")).click();
driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
driver.findElement(By.name("accountname")).sendKeys(data);
driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();


driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
Actions a=new Actions(driver);
a.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
driver.findElement(By.linkText("Sign Out")).click();
driver.close();
}
}
