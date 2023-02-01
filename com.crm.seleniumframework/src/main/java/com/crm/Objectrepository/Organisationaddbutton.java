package com.crm.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organisationaddbutton 
{
	//initialization
			public Organisationaddbutton(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			@FindBy(xpath="//img[@alt='Create Organization...']")
			private WebElement orgaddlink;
			
			public WebElement getOrgaddlink() {
				return orgaddlink;
			}
			
			public  void organisationaddlink() 
			{
				orgaddlink.click();
			}
		

}
