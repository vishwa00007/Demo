package com.crm.Myproject.com;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[2]/input")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[4]/input")).sendKeys("admin");
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[12]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		
		Random r=new Random();
		int ran = r.nextInt(1000);
		
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys("Qspider" +ran);

	}

}
