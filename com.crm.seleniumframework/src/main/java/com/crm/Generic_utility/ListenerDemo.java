 package com.crm.Generic_utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener
{

	public void onTestFailure(ITestResult result) {
		String data = result.getMethod().getMethodName();
		
		EventFiringWebDriver edriver=new EventFiringWebDriver(Baseclass.edriver);
		
		File src = edriver.getScreenshotAs(OutputType.FILE);
		try {
			File destfile = new File("./com.crm.seleniumframework/screenshot/"+data+"+.png");
			FileUtils.copyFile(src, destfile);
		}
		catch(Throwable e) 
		{
			e.printStackTrace();
		}
	}

}
