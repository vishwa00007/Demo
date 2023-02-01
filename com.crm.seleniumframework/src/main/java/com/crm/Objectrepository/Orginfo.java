package com.crm.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orginfo 
{
	//initialization
			public Orginfo(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
@FindBy(xpath="//span[@class='dvHeaderText']")
private WebElement orgconfirm;

public WebElement getOrgconfirm() {
	return orgconfirm;
}


}
