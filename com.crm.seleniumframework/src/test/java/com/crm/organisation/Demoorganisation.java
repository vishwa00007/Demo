package com.crm.organisation;

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
import com.crm.Objectrepository.Homepage;
import com.crm.Objectrepository.Loginpage;
import com.crm.Objectrepository.Organisationaddbutton;
import com.crm.Objectrepository.Organisationnameboxandsave;
import com.crm.Objectrepository.Orginfo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoorganisation extends Baseclass{
@Test(groups = "SmokeTest")
	public void demoorganisation() throws Throwable {
		Excel_utility elib=new Excel_utility(); 
		Java_utility jib=new Java_utility();
		File_utility fib=new File_utility();
		Webdriver_utility wu=new Webdriver_utility();
		//String BROWSER1 = fib.getPropertyKeyValue1("BROWSER");
		
		int rannum = jib.getRanDomNum();
		Homepage hp=new Homepage(driver);
		hp.Organisationlink();
		
		Organisationaddbutton oa=new Organisationaddbutton(driver);
		oa.organisationaddlink();
		
        String data = elib.getExcelData("Sheet2", 0, 0)+rannum;
		
		Organisationnameboxandsave o1=new Organisationnameboxandsave(driver);
		o1.getOrgnamebox().sendKeys(data);
		o1.getOrgsavebtn().click();
		
		Orginfo o=new Orginfo(driver);
		String src=o.getOrgconfirm().getText();
			
		if(src.contains(data))
		    {
				System.out.println("Data created successfully");
			}
		else 
		    {
				System.out.println("data not created");
			}
		
			
		hp.confirmlink();
		hp.signot();
		driver.quit();

	

	}
}

