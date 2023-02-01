package com.crm.campaign;

import org.openqa.selenium.WebDriver;
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

public class CampaigndemoTest extends Baseclass {
@Test(groups = "SmokeTest")
	public void campaigndemoTest() throws Throwable {
		Excel_utility elib=new Excel_utility(); 
		Java_utility jib=new Java_utility();
		File_utility fib=new File_utility();
		Webdriver_utility wu=new Webdriver_utility();
	    int rannum = jib.getRanDomNum();
		//home page
		Homepage hp=new Homepage(driver);
		hp.mrelink();
		hp.campaignlink();
		
		//new page
		Campaignaddbutton c=new Campaignaddbutton(driver);
		c.campaignaddlink();
		 String data = elib.getExcelData("Sheet1", 0, 0)+rannum;
        
         //enter name and save
        Campaignnameandsave c1=new Campaignnameandsave(driver);
        c1.getCampnamebox().sendKeys(data);
		c1.getCampsavebtn().click();
        
		
		//verification
        Campaigninform ci=new Campaigninform(driver);
        String src=ci.getCampinfo().getText();
		
		
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
