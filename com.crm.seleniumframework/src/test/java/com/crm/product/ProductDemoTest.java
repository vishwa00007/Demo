package com.crm.product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.Generic_utility.Baseclass;
import com.crm.Generic_utility.Excel_utility;
import com.crm.Generic_utility.File_utility;
import com.crm.Generic_utility.Java_utility;
import com.crm.Generic_utility.Webdriver_utility;
import com.crm.Objectrepository.Addpage;
import com.crm.Objectrepository.Creatingpage;
import com.crm.Objectrepository.Homepage;
import com.crm.Objectrepository.Loginpage;
import com.crm.Objectrepository.Productnameverification;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductDemoTest extends Baseclass {
@Test(groups = "RegressionTest")
	public void productDemoTest() throws Throwable{
		Excel_utility elib=new Excel_utility(); 
		Java_utility jib=new Java_utility();
		File_utility fib=new File_utility();
		Webdriver_utility wu=new Webdriver_utility();
		//String BROWSER1 = fib.getPropertyKeyValue1("BROWSER");
		
		int rannum = jib.getRanDomNum();
		
		//product page
		Homepage hp=new Homepage(driver);
		hp.productlink();
		
		//new product page
		Addpage ap=new Addpage(driver);
		ap.productaddlink();
		
		
		String data = elib.getExcelData("Sheet3", 0, 0)+rannum;
		
		//enter product name and save
		Creatingpage cp=new Creatingpage(driver);
		cp.getPnamebox().sendKeys(data);
		 cp.getProsavebtn().click();
	    
		//verification title
	    Productnameverification p=new Productnameverification(driver);
	    String src=p.getTitleconfirm().getText();
		
		if(src.contains(data)) {
			System.out.println("Data created successfully");
		}
		else {
			System.out.println("data not created");
		}
		hp.confirmlink();
		hp.signot();
		driver.quit();
	    }

        }

