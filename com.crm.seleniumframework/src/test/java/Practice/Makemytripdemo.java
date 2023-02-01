package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Makemytripdemo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		
	    driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();
		
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		String month="September 2022";
		String date="30";
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
		
		driver.findElement(By.xpath("//span[text()='RETURN']")).click();
		String month1="October";
		String date1="8";
		driver.findElement(By.xpath("//div[text()='"+month1+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date1+"']")).click();
		
		driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom5']")).click();
		Thread.sleep(2000);
		
		String a="3";
		driver.findElement(By.xpath("//li[@data-cy='adults-"+a+"']")).click();
		Thread.sleep(2000);
		
		String b="4";
		driver.findElement(By.xpath("//li[@data-cy='children-"+b+"']")).click();
		Thread.sleep(2000);
		
		String c="2";
		driver.findElement(By.xpath("//li[@data-cy='infants-"+c+"']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@data-cy='travelClass-0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-cy='travellerApplyBtn']")).click();
		
		
		
				
		
		
	
	
		
		
		

	}

}
