package com.crm.campaign;

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
import com.crm.Objectrepository.Pdelete;
import com.crm.Objectrepository.Productnameverification;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductcreateanddeletedempTest extends Baseclass{
@Test(groups = "RegressionTest")
	public void productcreateanddeletedempTest() throws Throwable{
		Excel_utility elib=new Excel_utility(); 
		Java_utility jib=new Java_utility();
		File_utility fib=new File_utility();
		Webdriver_utility wu=new Webdriver_utility();
		//String BROWSER1 = fib.getPropertyKeyValue1("BROWSER");
		
		int rannum = jib.getRanDomNum();
		//clicking on product
		Homepage hp=new Homepage(driver);
		hp.productlink();
		
		//Entering to new page
		Addpage ap=new Addpage(driver);
		ap.productaddlink();
		
		
		String data = elib.getExcelData("Sheet2", 0, 0)+rannum;
		
		//entering name and saving
		Creatingpage cp=new Creatingpage(driver);
		cp.getPnamebox().sendKeys(data);
	    cp.getProsavebtn().click();
	    
		//verification of name
	    Productnameverification p=new Productnameverification(driver);
	    String src=p.getTitleconfirm().getText();
		
		
		if(src.contains(data)) {
			System.out.println("Data created successfully");
		}
		else {
			System.out.println("data not created");
		}
		wu.WaitForElement(driver);
		
		//product delete
		Pdelete p1=new Pdelete(driver);
		p1.proddelete();
		
		//implicit wait
		wu.WaitForElement(driver);
		
		//pop up handling
		wu.Handlepopup(driver);
		
		//log out
		hp.confirmlink();
		hp.signot();
		driver.quit();
		}
	    }
