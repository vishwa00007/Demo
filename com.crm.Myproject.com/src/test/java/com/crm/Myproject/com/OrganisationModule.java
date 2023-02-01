package com.crm.Myproject.com;

import java.util.Random;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrganisationModule {
   
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[2]/input")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[4]/input")).sendKeys("admin");
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[6]/a")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		Random r=new Random();
		int ran = r.nextInt(5000);
		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Testyantra" +ran);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("www.youtube.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9739842384");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("vishu@gmail.com");
		Thread.sleep(3000);
		 WebElement list = driver.findElement(By.xpath("//tbody/tr[9]/td[2]/select[1]"));
		Select s=new Select(list);
		Thread.sleep(2000);
		s.selectByValue("Banking");
		WebElement rating = driver.findElement(By.xpath("//tbody/tr[9]/td[4]/select[1]"));
		Select s1=new Select(rating);
		s1.selectByValue("Active");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/table[1]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[1]/td[2]/img[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
        driver.close();
       
	}

}
