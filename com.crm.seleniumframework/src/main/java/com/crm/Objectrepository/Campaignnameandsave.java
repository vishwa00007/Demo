package com.crm.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaignnameandsave 
{
	//initialization
	public Campaignnameandsave(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//declaration
	@FindBy(name="campaignname")
	private WebElement campnamebox;
	
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement campsavebtn;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement addbtn;


	public WebElement getCampnamebox() {
		return campnamebox;
	}


	public WebElement getCampsavebtn() {
		return campsavebtn;
		
		}
	
	public WebElement getAddbtn() {
		return addbtn;
	}
	
	/*
	 * this method is used to enter campaign name and save
	 * @author vishwa
	 */
	
	


	public void campaignanme()
	{
		campnamebox.click();
	}
	
	public void campaigsave()
	{
		campsavebtn.click();
	}
	public void add() 
	{
		addbtn.click();
	}
}
