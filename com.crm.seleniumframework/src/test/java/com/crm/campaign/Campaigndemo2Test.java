package com.crm.campaign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.Generic_utility.Baseclass;
import com.crm.Generic_utility.Excel_utility;
import com.crm.Generic_utility.File_utility;
import com.crm.Generic_utility.Java_utility;
import com.crm.Generic_utility.Webdriver_utility;
import com.crm.Objectrepository.Campaignaddbutton;
import com.crm.Objectrepository.Campaigninform;
import com.crm.Objectrepository.Campaignnameandsave;
import com.crm.Objectrepository.Homepage;
import com.crm.Objectrepository.Loginpage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Campaigndemo2Test extends Baseclass {
@Test(groups = {"SmokeTest","RegressionTest"})
	public void campaigndemo2Test() throws Throwable{
		Excel_utility elib=new Excel_utility(); 
		
		File_utility fib=new File_utility();
	    Webdriver_utility wu=new Webdriver_utility();
		//String BROWSER1 = fib.getPropertyKeyValue1("BROWSER");
		Java_utility jib=new Java_utility();
		
		int rannum = jib.getRanDomNum();
		//home page
		Homepage hp=new Homepage(driver);
		hp.mrelink();
		hp.campaignlink();
		
		//new page
		Campaignaddbutton c=new Campaignaddbutton(driver);
		c.campaignaddlink();
		String data = elib.getExcelData("Sheet3", 0, 0)+rannum;
		
		 Campaignnameandsave c1=new Campaignnameandsave(driver);
	     c1.getCampnamebox().sendKeys(data);
		c1.add();
	     
	  wu.switchToWindow(driver, "product window");
	  
	  String data1 = elib.getExcelData("Sheet4", 0, 0);
	  driver.findElement(By.xpath("//body[@class='small']")).sendKeys(data1);
	  driver.findElement(By.xpath("//input[@name='search']")).click();
	  
	  //dynamic xpath
	  driver.findElement(By.xpath("//a[text()='"+data1+"']")).click();
	  wu.switchToWindow(driver, "campaign window");
       
        c1.getCampsavebtn().click();
      
        
      //verification
        Campaigninform ci=new Campaigninform(driver);
        String src=ci.getCampinfo().getText();
		
      
       if(src.contains(data)) {
    	   System.out.println("pass");
    	   
       }
       else {
    	   System.out.println("fail");
       }

		//log out
		hp.confirmlink();
		hp.signot();
      
		driver.quit();
		

	}

}
